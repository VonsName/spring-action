package com.von.spaction.express;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 16:55
 */
public class ArticleTest2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("article.xml");
        Article bean = context.getBean(Article.class);
        System.out.println(bean);
    }
}
