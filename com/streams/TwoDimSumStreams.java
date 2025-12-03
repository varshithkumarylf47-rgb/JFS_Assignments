package com.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoDimSumStreams {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int sum = Arrays.stream(numbers)
                .flatMapToInt(Arrays::stream)
                .sum();

        System.out.println(sum);

    }


    }

