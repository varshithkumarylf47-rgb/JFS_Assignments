package com.streams.quest;

import java.util.Arrays;
import java.util.List;

public class MobileMain {
    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(
                new Mobile("Galaxy S23", "Samsung", 799.99, 101),
                new Mobile("iPhone 15", "Apple", 999.49, 102),
                new Mobile("OnePlus 12", "OnePlus", 749.00, 103),
                new Mobile("iPhone 18 Pro", "Apple", 1899.00, 104),
                new Mobile("Moto Edge 40", "Motorola", 599.99, 105)
        );

        mobiles.forEach(System.out::println); //a
        System.out.println();

        mobiles.stream()                        //b
                .filter(str -> str.getBrand().equalsIgnoreCase("Apple"))
                .forEach(System.out::println);
        System.out.println();

        mobiles.stream()            //c
                .sorted((m1, m2) -> m1.getBrand().compareTo(m2.getBrand()))
                .forEach(System.out::println);
        System.out.println();

        Mobile idMobile = mobiles.stream()          //d
                .filter(m -> m.getMobileId() == 105)  //will throw exception when m.getMobileId() == 10
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Mobile with ID 10 not found"));
        System.out.println(idMobile);
        System.out.println();

        mobiles.stream()            //e
                .filter(m -> m.getPrice() < 1000)
                .sorted((m1, m2) -> m1.getBrand().compareTo(m2.getBrand()))
                .map(Mobile::getBrand)
                .forEach(System.out::println);
        System.out.println();

        mobiles.stream()            //f
                .sorted((m1, m2) -> m1.getBrand().compareTo(m2.getBrand()))
                .map(Mobile::getBrand)
                .forEach(System.out::println);
        System.out.println();


    }
}
