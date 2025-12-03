package com.streams;


import java.util.List;
import java.util.stream.Stream;

public class RandomStream {
    public static void main(String[] args) {
        List<Integer> randomNumbers =
                Stream.generate(() -> (int)(Math.random() * 100))
                        .limit(5)
                        .toList();

        System.out.println(randomNumbers);
    }
}
