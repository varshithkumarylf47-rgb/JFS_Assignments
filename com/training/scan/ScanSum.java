package com.training.scan;

import java.util.Scanner;

public class ScanSum {
    public static void main(String[] args) {

        int[] numbers = new int[6];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Entered numbers: ");
        for (int number : numbers)
            System.out.print(number + " ");
        System.out.println();
        System.out.print("Sum of all the numbers in the array : ");
        for (int number : numbers) {
            sum += number;
        }
        System.out.print(" " + sum);
        System.out.println();
        System.out.println("Average of all the numbers in the array : " + (double) sum / numbers.length);
        System.out.print("Square of the numbers in the array : ");
        for (int number : numbers)
            System.out.print(number * number + " ");
    }
}
