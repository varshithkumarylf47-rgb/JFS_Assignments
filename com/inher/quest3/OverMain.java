package com.inher.quest3;

import java.util.Scanner;

public class OverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose figure to calculate volume:");
        System.out.println("1. Cube\n2. Cuboid\n3. Oval (Ellipsoid)\n4. Cylinder");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();

        Figures fig;

        switch (choice) {
            case 1:
                fig = new Cube();
                System.out.print("Enter side of Cube: ");
                int a = scanner.nextInt();
                fig.volume(a, 0);
                break;

            case 2:
                fig = new Cuboid();
                System.out.print("Enter length: ");
                int l = scanner.nextInt();
                System.out.print("Enter width: ");
                int w = scanner.nextInt();
                fig.volume(l, w);
                break;

            case 3:
                fig = new Oval();
                System.out.print("Enter semi-axis a: ");
                int ax = scanner.nextInt();
                System.out.print("Enter semi-axis b: ");
                int bx = scanner.nextInt();
                fig.volume(ax, bx);
                break;

            case 4:
                fig = new Cylinder();
                System.out.print("Enter radius: ");
                int r = scanner.nextInt();
                System.out.print("Enter height: ");
                int h = scanner.nextInt();
                fig.volume(r, h);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
