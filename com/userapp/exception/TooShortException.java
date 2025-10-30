package com.userapp.exception;

public class TooShortException extends RuntimeException {
    public TooShortException() {

    }

    public TooShortException(String message) {
        System.out.println(message);
    }
}
