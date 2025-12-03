package com.streams;

import java.util.Arrays;
import java.util.List;

public class SumNumbersFromString {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("4821", "97", "6035",
                "128", "7549", "2301", "89", "5127", "3490", "706");


        int sum = numbers.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(sum);

    }
}
