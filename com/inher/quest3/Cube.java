package com.inher.quest3;

public class Cube extends Figures {

    @Override
    void volume(int x, int y) {
        int vol = x * x * x;
        System.out.println("Volume of Cube: " + vol);
    }

}



