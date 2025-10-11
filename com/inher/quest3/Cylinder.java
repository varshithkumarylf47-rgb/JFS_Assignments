package com.inher.quest3;

public class Cylinder extends Figures {

    @Override
    void volume(int r, int h) {
        double vol = Math.PI * r * r * h;
        System.out.printf("Volume of Cylinder: %.2f\n", vol);
    }

}
