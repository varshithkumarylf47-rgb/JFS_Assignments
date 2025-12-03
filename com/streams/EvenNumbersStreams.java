package com.streams;

import java.util.stream.IntStream;

public class EvenNumbersStreams {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100)
                .filter(x->x%2==0)
                .forEach(System.out::println);
    }
}
