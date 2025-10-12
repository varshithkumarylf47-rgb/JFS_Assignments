package com.training.scan;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String[] userNames = {"shivani21", "arun05", "shailaja19", "varshith27"};
        System.out.print("Enter username to login : ");
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        for (String name : userNames) {
            if (userName.equals(name)) {
                System.out.println("You are logged in successfully");
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Invalid username");
        }
    }
}
