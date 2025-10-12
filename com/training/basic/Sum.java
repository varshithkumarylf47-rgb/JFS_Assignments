package com.training.basic;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Entered numbers: ");
        for (int number : numbers)
            System.out.print(number + " ");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + sum / numbers.length);

        scanner.close();
    }
}
