package com.streams;

import java.util.Arrays;
import java.util.List;

public class LengthNameStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rohan", "Arjun", "Anika", "Samuel", "Neha",
                "Sahil", "Rohan", "Anika", "Kavya", "Sophia", "Daniel",
                "Sneha", "Priya", "Samuel", "Michael", "Rohan", "Sanjay", "Varun",
                "Anika", "Rahul", "Samuel");
        System.out.println("Length of each name in the list");
        names.stream()
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Sum of length of all the names in the list");
        System.out.println(names.stream()
                .mapToInt(String::length)
                .sum());
    }
}
