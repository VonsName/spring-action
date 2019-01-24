package com.von.spaction.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

/**
 * @author : vons
 * @version 1.0
 * @date : 2019/1/24 22:21
 * 该类比Configuration注解的类要先加载
 */
public class MagicCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
//        String[] defaultProfiles = environment.getDefaultProfiles();
//        if (Arrays.asList(defaultProfiles).contains("dev")) {
//            return true;
//        }
        return environment.containsProperty("test");
//        String test = environment.getProperty("test");
//        if (StringUtils.isEmpty(test)) {
//            return true;
//        }
//        return false;
    }
}
