package com.von.spaction.express;

/**
 * @author ： fjl
 * @date ： 2019/1/25/025 16:38
 */
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
