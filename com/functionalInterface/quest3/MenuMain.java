package com.functionalInterface.quest3;

import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        IMenu menu = (String[] items) -> {
            for (String item : items)
                System.out.println(item);
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Starters\n2.Desserts\n3.Main Course\nChoose any one of the meal course from above: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                String[] itemsS = {"Paneer Tikka", "Samosa", "Aloo Tikki", "Chicken Tikka", "Veg Manchurian"};
                menu.printMenu(itemsS);
                break;
            case 2:
                String[] itemsD = {"Gulab Jamun", "Rasmalai", "Jalebi", "Kheer", "Gajar Ka Halwa", "Rasgulla"};
                menu.printMenu(itemsD);
                break;
            case 3:
                String[] itemsM = {"Butter Chicken", "Paneer Butter Masala", "Dal Makhani", "Rogan Josh", "Biryani"};
                menu.printMenu(itemsM);
                break;
            default:
                System.out.println("Invalid value: " + option);
                break;
        }
    }
}

