package com.training.scan;

import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Shivani");
        names.add("Arun");
        names.add("Shailaja");
        names.add("Varshith");
        System.out.print("Enter name to register : ");
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.next();
        if (names.contains(newName))
            System.out.println("You are registered");
        else
            System.out.println("Name is not unique");
    }


}


