package com.training.scan;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String[] names = {"Shivani", "Arun", "Shailaja", "Varshith"};
        System.out.print("Enter name to register : ");
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.next();
        for (String name : names) {
            if (newName.equals(name)) {
                System.out.println("Name is not unique");
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("You are registered");
        }
    }
}
