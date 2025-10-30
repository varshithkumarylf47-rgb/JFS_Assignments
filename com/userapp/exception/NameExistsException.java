package com.userapp.exception;

public class NameExistsException extends RuntimeException {

    public NameExistsException(String message) {
        System.out.println(message);
    }
    public NameExistsException() {}

}
