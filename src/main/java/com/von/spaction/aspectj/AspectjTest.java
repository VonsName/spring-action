package com.von.spaction.aspectj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vons0
 */
public class AspectjTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspectj.xml");
//        context.start();
        Object bookProxy = context.getBean("bookProxy");
    }
}
