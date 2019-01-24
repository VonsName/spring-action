package com.von.spaction.aspectj;

/**
 * @author vons0
 */
public class BookImpl implements Book{
    @Override
    public void add() {
        System.out.println("add book");
    }

    @Override
    public void delete() {
        System.out.println("delete book");
    }
}
