package com.von.spaction.annotation;

import com.von.spaction.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author vons0
 */
@Configuration
public class UserConfig {

    @Bean
    public User user() {
        return new User("wangwu", "zuqiu");
    }
}
