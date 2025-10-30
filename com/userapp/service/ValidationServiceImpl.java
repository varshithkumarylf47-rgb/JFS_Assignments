package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {
    public boolean validateUsername(String username) throws NameExistsException {
        String[] usernames = {"Sri", "Priya”,”Joe", "Kathy"};
        for (String name : usernames) {
            if (username.equalsIgnoreCase(name)) {
                throw new NameExistsException("Name already exists");
            }
        }
        return true;
    }

    public boolean validatePassword(String password) throws TooShortException, TooLongException {
        if (password.length() < 6) {
            throw new TooShortException("password too short (less than 6 characters)");
        } else if (password.length() > 15) {
            throw new TooLongException("password too long (more than 15 characters )");
        } else
            return true;
    }

}
