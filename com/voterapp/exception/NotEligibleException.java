package com.voterapp.exception;

public class NotEligibleException extends Exception {
    public NotEligibleException() {
    }
    public NotEligibleException(String message) {
        System.out.println("NOT ELIGIBLE TO VOTE");
    }

}
