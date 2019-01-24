package com.von.spaction.condition;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.*;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;

import java.util.Properties;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/24 22:22
 */
@Configuration
@ComponentScan(basePackages = {"com.von"})
public class MagicConfig implements EnvironmentAware {


    private Environment environment;

    public Environment getEnvironment() {
        return environment;
    }

    /**
     * Conditional 注解的值必须是
     * org.springframework.context.annotation.Condition接口的类型
     *
     * @return
     */
    @Bean
    @Conditional(MagicCondition.class)
    @Profile(value = "dev")
    public Magic magic() {
        return new Magic();
    }

    @Override
    public void setEnvironment(Environment environment) {
        ConfigurableEnvironment c = (ConfigurableEnvironment) environment;
        MutablePropertySources propertySources = c.getPropertySources();
        Properties properties = new Properties();
        properties.put("test", "test1");
        propertySources.addFirst(new PropertiesPropertySource("default", properties));
        this.environment = environment;
    }
}
