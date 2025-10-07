package com.training.basic;

public class Fibonacci {
    public static void main(String[] args) {
        int[] arrayFib = new int[20];
        arrayFib[0] = 0;
        arrayFib[1] = 1;
        System.out.print("Fibonacci Series from 1 to 100: " + arrayFib[0] + " " + arrayFib[1] + " ");
        for (int i = 2; i <= arrayFib.length; i++) {
            arrayFib[i] = arrayFib[i - 1] + arrayFib[i - 2];
            if (arrayFib[i] > 100) {
                break;
            }
            System.out.print(arrayFib[i] + "  ");

        }
    }
}
