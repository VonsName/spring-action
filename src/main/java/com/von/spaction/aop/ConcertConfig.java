package com.von.spaction.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 17:02
 * EnableAspectJAutoProxy : 启用自动代理
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }
}
