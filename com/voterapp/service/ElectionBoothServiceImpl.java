package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {
    NotEligibleException e;
    int age;
    String locality;
    int vid;

    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
        this.age = age;
        this.locality = locality;
        this.vid = vid;
        checkAge(age);
        checkLocality(locality);
        checkVoterId(vid);
        return false;
    }

    private boolean checkAge(int age) throws UnderAgeException {

        if (age < 18) {
            throw new UnderAgeException("age less than 18");
        } else {
            return true;
        }
    }

    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        String[] localities = {"JP Nagar", "ABC Nagar", "whitefield" };
        for (String local : localities) {
            if (locality.equalsIgnoreCase(local)) {
                return true;
            }
        }
        throw new LocalityNotFoundException("Invalid Locality");
    }

    private boolean checkVoterId(int voterId) throws InvalidVoterIDException {
        if (voterId < 1000 || voterId > 9999) {
            throw new InvalidVoterIDException("invalid ID. TRY AGAIN!!");
        } else {
            return true;
        }
    }
}