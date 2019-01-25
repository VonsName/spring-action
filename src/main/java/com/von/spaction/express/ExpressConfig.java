package com.von.spaction.express;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.PropertiesPropertySourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 16:23
 */
@Configuration
@PropertySource(value = "classpath:article.properties")
public class ExpressConfig {

    /**
     * PropertySource引入的properties中的属性会注入到 Environment 中
     */
    @Autowired
    private Environment environment;

    @Bean
    public Article article() {
        Integer count = environment.getProperty("article.count", Integer.class, 30);
        String name = environment.getProperty("article.name");
        String content = environment.getRequiredProperty("article.content");
        return new Article(name, content, count,5L);
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourceLoader() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
