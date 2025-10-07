package com.training.basic;

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextInt();

        System.out.print("Numbers entered : ");
        for (int number : numbers)
            System.out.print(number + " ");

        System.out.println();

        int duplicateNumber = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[0] == numbers[i])
            {
                duplicateNumber = duplicateNumber + 1;
            }
        }
        System.out.println(duplicateNumber);
        sc.close();
    }
}
