package com.von.spaction.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 17:08
 */
public class PerformTest {
    public static void main(String[] args) throws NoSuchMethodException {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:aop.xml");
        Performance bean = applicationContext.getBean("annotationPerform",Performance.class);
        bean.perform();
        Class<? extends Performance> aClass = bean.getClass();
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);
        System.out.println();
    }
}
