package com.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumStreams {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
        int result = Arrays.stream(numbers)
                .sum();
        System.out.println(result);
        result = IntStream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16).sum();
        System.out.println(result);

    }
}
