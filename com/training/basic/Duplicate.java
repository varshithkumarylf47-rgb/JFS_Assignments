package com.training.basic;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 3, 4, 5, 2, 4, 5, 6, 7, 8};
        Arrays.sort(numbers);
        for (int value : numbers)
            System.out.print(value + " ");
        // check no.of 4's
    }

}

