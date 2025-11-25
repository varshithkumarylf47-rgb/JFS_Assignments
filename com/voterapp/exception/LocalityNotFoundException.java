package com.voterapp.exception;

public class LocalityNotFoundException extends NotEligibleException {
    public LocalityNotFoundException(String message) {
        System.out.println("LOCALITY INVALID");
    }
}
