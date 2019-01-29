package com.von.spaction.springmvc;

/**
 * @author ： fjl
 * @date ： 2019/1/28/028 14:52
 */
public class MyException extends RuntimeException{

    private static final long serialVersionUID = -747400153945362337L;
    private String message;

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
