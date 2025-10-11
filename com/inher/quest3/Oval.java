package com.inher.quest3;

import java.util.Scanner;

public class Oval extends Figures {

    @Override
    void volume(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First semi-axis (a): "+a +"\t"+"Second semi-axis (b): "+b);
        System.out.print("Enter third semi-axis (c) of Ellipsoid: ");
        int c = sc.nextInt();
        double vol = (4.0 / 3.0) * Math.PI * a * b * c;
        System.out.printf("Volume of Ellipsoid: %.2f\n", vol);
    }

}
