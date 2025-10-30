package com.interfaceBasics.quest6;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        ICuisine cuisine;
        String type;
        String[] course;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter type of Cuisine -> Indian / International : ");
        String optionC = scanner.next();
        switch (optionC.toLowerCase()) {
            case "indian":
                cuisine = new Indian();
                System.out.print("Enter type of Meal Course -> Starters, Main Course, Desserts :  ");
                type = scanner.next();
                course = cuisine.showMenus(type);
                if (course != null) {
                    for (String coursesM : course)
                        System.out.println(coursesM);
                } else
                    System.out.println("Enter valid option");
                break;
            case "international":
                cuisine = new International();
                System.out.print("Enter type of Meal Course -> Starters, Main Course, Desserts :  ");
                type = scanner.next();
                course = cuisine.showMenus(type);
                if (course != null) {
                    for (String coursesM : course)
                        System.out.println(coursesM);
                } else
                    System.out.println("Enter valid option");
                break;
            default:
                System.out.println("Enter Valid Option");
        }
    }
}
