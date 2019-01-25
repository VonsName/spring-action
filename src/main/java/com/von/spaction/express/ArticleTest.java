package com.von.spaction.express;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 16:26
 */
public class ArticleTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExpressConfig.class);
        Article bean = context.getBean(Article.class);
        System.out.println(bean);
    }
}
