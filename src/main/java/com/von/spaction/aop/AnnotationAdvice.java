package com.von.spaction.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 17:21
 */
@Aspect
@Component
public class AnnotationAdvice {

    @Pointcut("@annotation(com.von.spaction.aop.ServiceAop)")
    public void annotation() {
    }

    @Before("annotation()")
    public void annotationPerform() {
        System.out.println("基于注解方法执行之前调用");
    }
}
