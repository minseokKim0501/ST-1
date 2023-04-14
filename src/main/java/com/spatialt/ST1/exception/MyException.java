package com.spatialt.ST1.exception;

public class MyException extends RuntimeException{
    private String message;

    public MyException(String message){
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
