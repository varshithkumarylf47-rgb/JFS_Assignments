package com.functionalInterface.quest2;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        ICalculator calculator;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Sum\n2.Product\n3.Square root\n4.Cube\nChoose any one of the operations from above: ");
        int option = scanner.nextInt();
        System.out.print("Enter two number to perform the operations: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        switch (option) {
            case 1:
                calculator = (s1, s2) -> System.out.print("Sum of the given numbers = " + (s1 + s2));
                calculator.calculate(x, y);
                break;
            case 2:
                calculator = (s1, s2) -> System.out.print("Product of the given numbers = " + (s1 * s2));
                calculator.calculate(x, y);
                break;
            case 3:
                calculator = (s1, s2) -> System.out.print("Square root of the given numbers = " + (Math.sqrt(s1)) + " & " + (Math.sqrt(s2)));
                calculator.calculate(x, y);
                break;
            case 4:
                calculator = (s1, s2) -> System.out.print("Cube of the given numbers = " + (Math.pow(s1, 3)) + " & " + (Math.pow(s2, 3)));
                calculator.calculate(x, y);
                break;
        }
    }
}
