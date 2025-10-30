package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the username: ");
        String userName = scanner.next();
        IValidationService service = new ValidationServiceImpl();
        try {
            service.validateUsername(userName);
        } catch (NameExistsException e) {
            System.out.print("Try other username");
            System.exit(0);
        }
        System.out.print("Enter the password: ");
        String passWord = scanner.next();
        try {
            service.validatePassword(passWord);
            System.out.println("Welcome " + userName + "\nYou are registered");
        } catch (TooLongException e) {
            throw new TooLongException();
        } catch (TooShortException e) {
            throw new TooShortException();
        }
    }
}
