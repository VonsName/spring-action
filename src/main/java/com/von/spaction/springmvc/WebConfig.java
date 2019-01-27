package com.von.spaction.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/27 19:04
 * EnableWebMvc:表示启用SpringMvc
 * ComponentScan:主要是开启扫描带有@Controller等类似注解的类,用于让Spring找到合适的控制器
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.von.spaction.springmvc")
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("classpath:/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    /**
     * 配置对静态资源的处理
     * 表示对静态资源会转发到Servlet容器中默认的Servlet上
     *
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
