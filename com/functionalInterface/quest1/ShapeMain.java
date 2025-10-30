package com.functionalInterface.quest1;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        IShape shape;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the shape to find the area:\n1.Rectangle\n2.Triangle\n3.Square");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                shape = (x, y) -> System.out.println("Area of rectangle : " + (x * y));
                System.out.print("Enter the length and breath of the rectangle: ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                shape.area(x, y);
                break;
            case 2:
                shape = (h, b) -> System.out.println("Area of triangle : " + (0.5 * h * b));
                System.out.print("Enter the height and base of the triangle: ");
                int h = scanner.nextInt();
                int b = scanner.nextInt();
                shape.area(h, b);
                break;
            case 3:
                shape = (s, _) -> System.out.println("Area of square : " + ( s * s));
                System.out.print("Enter the side length of the square: ");
                int s = scanner.nextInt();
                shape.area(s, s);
                break;
        }
    }
}
