package com.von.spaction.aspectj;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author vons0
 */
public class MyAdvice implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行之前");
        Object invoke = method.invoke(o);
        System.out.println("方法执行之后");
        return invoke;
    }
}
