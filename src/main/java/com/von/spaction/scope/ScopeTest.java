package com.von.spaction.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 11:22
 */
public class ScopeTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NotepadConfig.class);
        Notepad bean = context.getBean(Notepad.class);
        System.out.println("bean" + bean);
        Notepad bean1 = context.getBean(Notepad.class);
        System.out.println("bean1" + bean1);
        System.out.println(bean == bean1);
    }
}
