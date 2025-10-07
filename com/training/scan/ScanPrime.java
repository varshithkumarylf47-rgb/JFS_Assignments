package com.training.scan;

import java.util.Scanner;

public class ScanPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int primeCount = 1;
        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0)
            System.out.println("Entered number " + number + " is not a prime number");
        else {
            for (int i = 7; i <= number; i++) {
                if (number % i == 0) {
                    primeCount++;
                }
            }
            if (primeCount == 2)
                System.out.println("Entered number " + number + " is a prime number");
            else
                System.out.println("Entered number " + number + " is not a prime number");
        }
        scanner.close();
    }
}
