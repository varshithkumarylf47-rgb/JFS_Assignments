package com.voterapp.client;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

import java.text.MessageFormat;
import java.util.Scanner;

public class Voter {
    public static void main(String[] args) throws NotEligibleException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age:  ");
        int age = scanner.nextInt();
        System.out.print("Enter locality:  ");
        String locality = scanner.next();
        System.out.print("Enter voter ID:  ");
        int voterID = scanner.nextInt();

        IElectionBoothService election = new ElectionBoothServiceImpl();
        try {
            election.checkEligibility(age,locality,voterID);
            System.out.println("You are eligible to vote");
        } catch (InvalidVoterIDException | LocalityNotFoundException | UnderAgeException e){
            System.out.println("PLEASE ENTER VALID VALUE.");
        }

    }
}
