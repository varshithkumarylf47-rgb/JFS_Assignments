package com.inher.quest3;

import java.util.Scanner;

public class Cuboid extends Figures {

    @Override
    void volume(int l, int w) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of Cuboid: ");
        int h = sc.nextInt();
        int vol = l * w * h;
        System.out.println("Volume of Cuboid: " + vol);
    }

}
