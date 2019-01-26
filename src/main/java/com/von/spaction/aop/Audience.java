package com.von.spaction.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 16:49
 * Aspect表示该类是一个切面
 */
@Aspect
public class Audience {


//    @Pointcut("execution(* com.von.spaction.aop.Performance.*(..))")
    public void performance() {
    }


    /**
     * Before 表示会在目标方法调用之前调用
     */
//    @Before("performance()")
//    public void silenceCellPhones() {
//        System.out.println("执行perform之前..silenceCellPhones");
//    }
//
//    /**
//     * After 表示会在方法返回或者抛出异常的时候调用
//     */
//    @After("performance()")
//    public void afterCellPhones() {
//        System.out.println("执行perform之后..afterCellPhones");
//    }
//
//    /**
//     * AfterReturning 表示会在目标方法返回之后调用
//     */
//    @AfterReturning("performance()")
//    public void afterReturnCellPhones() {
//        System.out.println("执行perform方法调用返回结果后.. afterReturnCellPhones");
//    }
//
//    /**
//     * AfterThrowing 表示会在目标方法抛出异常之后调用
//     */
//    @AfterThrowing("performance()")
//    public void afterThrowCellPhones() {
//        System.out.println("执行perform抛出异常时候..afterThrowCellPhones");
//    }

    /**
     * Around 表示方法执行之前和执行之后都会调用
     */
//    @Around("performance()")
    public void aroundCellPhones(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("执行perform之前");
        joinPoint.proceed();
        System.out.println("执行perform..Around之后");
    }
}
