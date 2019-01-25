package com.von.spaction.express;

import com.von.spaction.bean.User;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 16:23
 */
public class Article {

    private String name;
    private String content;
    private Integer count;
    private Long num;

    private User user;

    public Article() {
    }

    public Article(String name, String content, Integer count, Long num, User user) {
        this.name = name;
        this.content = content;
        this.count = count;
        this.num = num;
        this.user = user;
    }

    public Article(String name, String content, Integer count, Long num) {
        this.name = name;
        this.content = content;
        this.count = count;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", count=" + count +
                ", num=" + num +
                ", user=" + user +
                '}';
    }
}
