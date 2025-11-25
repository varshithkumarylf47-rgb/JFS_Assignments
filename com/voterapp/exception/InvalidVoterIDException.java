package com.voterapp.exception;

public class InvalidVoterIDException extends NotEligibleException {
    public InvalidVoterIDException(String message) {
        System.out.println("VOTER ID INVALID");
    }
}
