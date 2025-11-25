package com.voterapp.exception;

public class UnderAgeException extends NotEligibleException {
    public UnderAgeException(String message) {
        System.out.println("UNDER AGE. VOTE AFTER TURNING 18!");
    }
}
