package com.von.spaction.di;

import com.von.spaction.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author vons0
 * Profile 表示只有在dev环境下该配置类的Bean才会创建生效
 * 如果Bean没有指定Profile,则无论在哪个环境都会创建
 */
@Configuration
@Profile(value = "dev")
public class DevProfileConfig {

    @Bean
    public User user() {
        return new User("开发", "撸代码");
    }
}
