package com.training.basic;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextInt();

        System.out.print("Numbers entered : ");

        for (int number : numbers)
            System.out.print(number + " ");

        System.out.println();

        int greatestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (greatestNumber < numbers[i]) {
                greatestNumber = numbers[i];
            }
        }
        System.out.println("Greatest number from the entered Array : " + greatestNumber);
        sc.close();
    }

}
