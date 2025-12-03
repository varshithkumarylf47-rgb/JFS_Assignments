package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DuplicateNameStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rohan", "Arjun", "Anika", "Samuel", "Neha",
                "Sahil", "Rohan", "Anika", "Kavya", "Sophia", "Daniel",
                "Sneha", "Priya", "Samuel", "Michael", "Rohan", "Sanjay", "Varun",
                "Anika", "Rahul", "Samuel");
        names.forEach(System.out::println);

        System.out.println("\nnames starting with S\n");
        names.stream()
                .distinct()
                .filter(str -> str.startsWith("S"))
                .forEach(System.out::println);
        System.out.println("\nsort, remove duplicates and print only the first name");
        Optional<String> firstName = names.stream()
                .distinct().min(String::compareTo);

        System.out.println(firstName.get());

    }
}
