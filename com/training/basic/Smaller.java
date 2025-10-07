package com.training.basic;

import java.util.Scanner;

public class Smaller {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextInt();

        System.out.print("Numbers entered : ");

        for (int number : numbers)
            System.out.print(number + " ");

        System.out.println();

        int smallestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (smallestNumber > numbers[i]) {
                smallestNumber = numbers[i];
            }
        }
        System.out.println("Smallest number from the entered Array : " + smallestNumber);
        sc.close();
    }
}
