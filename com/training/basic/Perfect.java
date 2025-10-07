package com.training.basic;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int factors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors = factors + i;
            }
        }
        if (number == factors) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number+ " is not a perfect number");
        }
    }
}
