package com.von.spaction.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 10:23
 */
public class AutoWireTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DessertConfig.class);
        Dessert bean = context.getBean(Dessert.class);
    }
}
