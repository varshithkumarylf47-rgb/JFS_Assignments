package com.training.scan;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("shivani21");
        userNames.add("arun05");
        userNames.add("shailaja19");
        userNames.add("varshith27");
        System.out.print("Enter username to login : ");
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.next();
        if(userNames.contains(newName))
            System.out.println("You are logged in successfully");
        else
            System.out.println("Invalid username");
    }
}