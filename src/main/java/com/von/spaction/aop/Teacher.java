package com.von.spaction.aop;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/26 17:59
 */
public class Teacher {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                '}';
    }
}
