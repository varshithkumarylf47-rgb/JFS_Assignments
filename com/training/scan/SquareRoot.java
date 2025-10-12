package com.training.scan;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        double[] numbers = new double[3];
        System.out.print("Enter the numbers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Entered array: ");
        for (double number : numbers)
            System.out.print(number + " ");
        System.out.println();
        double[] squareRootNumbers = new double[3];

        for (int i = 0; i < numbers.length; i++) {
            squareRootNumbers[i] = Math.sqrt(numbers[i]);
        }
        System.out.print("Square root of the arrays entered above in a new array: ");
        for( double rootNumber : squareRootNumbers ){
            System.out.print(rootNumber+" ");
        }

    }
}
