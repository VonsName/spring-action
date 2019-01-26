package com.von.spaction.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 18:38
 */
@Aspect
@Component
public class EncoreableIntroducer {

    @DeclareParents(value = "com.von.spaction.aop.Performance+",
            defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
