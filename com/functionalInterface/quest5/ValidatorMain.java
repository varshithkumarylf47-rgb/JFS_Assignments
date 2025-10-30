package com.functionalInterface.quest5;

import java.util.Scanner;

public class ValidatorMain {
    public static void main(String[] args) {
        String[] names = {"aaron", "amit", "Arun", "Anil", "aruna"};
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        boolean value = false;
        for (String nameCheck : names) {
            if (name.equalsIgnoreCase(nameCheck)) {
                value = true;
                break;
            }
        }
        IValidator validator;
        if (value) {
            validator = (String nameChecker) -> "You are logged in " + nameChecker;
        } else {
            validator = (String nameChecker) -> "You are registered " + nameChecker;
        }
        System.out.println(validator.validateUser(name));
    }
}
