package com.userapp.exception;

public class TooLongException extends RuntimeException {

    public TooLongException() {
    }

    public TooLongException(String message) {
        System.out.println(message);
    }

}

