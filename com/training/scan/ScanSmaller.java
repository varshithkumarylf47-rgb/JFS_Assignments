package com.training.scan;

import java.util.Scanner;

public class ScanSmaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && a < c) {
            System.out.println(a + " is smaller than " + b + " and " + c);
        } else if (b < c) {
            System.out.println(b + " is smaller than " + a + " and " + c);
        } else {
            System.out.println(c + " is smaller than " + a + " and " + b);
        }
    }
}