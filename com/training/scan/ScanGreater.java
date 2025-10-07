package com.training.scan;

import java.util.Scanner;

public class ScanGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String result = a > b ? (a > c ? a + " is greater than " + b + " and " + c : c + " is greater than" + a + " and " + b) :
                (b > c ? b + " is greater than " + a + " and " + c : c + " is greater than " + a + " and " + b);
        System.out.println(result);
    }
}

