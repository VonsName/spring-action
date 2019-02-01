package com.von.spaction.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.Md4PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.sql.DataSource;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/2/1 21:35
 * EnableWebSecurity:启用web的安全功能
 */
@Configuration
//@EnableWebMvcSecurity
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .regexMatchers("/user/.*").hasRole("ADMIN")
                .regexMatchers("/login/.*").access("hasRole('ROLE_ADMIN') and hasIpAddress('192.168.1.33') and hasAuthority('ROLE_MANAGE')")
                .regexMatchers("/user/.*").hasIpAddress("192.168.1.123")
                .antMatchers("/spitter/**").hasAuthority("ROLE_ADMIN")
                .antMatchers(HttpMethod.POST, "spittles").authenticated()
                .anyRequest().permitAll()
                .and()
                .requiresChannel()
                //requiresSecure 表示对于/spitter/form路径的所有请求都需要HTTPS才能访问
                .antMatchers("/spitter/form").requiresSecure()
                //requiresInsecure 不需要HTTPS,只需要HTTP
                .antMatchers("/**").requiresInsecure()
                .and()
                //formLogin :启用默认的登录页
                .formLogin();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //roles是authorities方法的简写
        //roles默认会在给点角色前加ROLE_
        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("USER")
                .and()
                .withUser("admin").password("password").authorities("ROLE_USER", "ROLE_ADMIN");
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select username,password from spitter where username=?")
                .authoritiesByUsernameQuery("select username,'ROLE_USER' from spitter where username=?")
                .passwordEncoder(new MyPasswordEncoder());

        //登陆表单中提交的密码默认会与用户的LDAP条目中的userPassword属性进行比对
        //可以通过passwordAttribute指定属性
        auth.ldapAuthentication()
                .userSearchBase("ou=people")
                .userSearchFilter("(uid={0})")
                .groupSearchBase("ou=groups")
                .groupSearchFilter("member={0}")
                .contextSource().root("dc=habuma,dc=com")
                .ldif("classpath:users.ldif");
//                .passwordCompare()
//                .passwordEncoder(new MyPasswordEncoder())
//                .passwordAttribute("password");
        auth.userDetailsService(new MyUserDetailsServiceImpl());
    }
}
