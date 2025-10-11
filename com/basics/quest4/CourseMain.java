package com.basics.quest4;

import java.util.Scanner;

public class CourseMain {
    public static void main(String[] args) {
        Training train = new Training();
        System.out.print("Courses: ");
        for (String course : train.showCourses()) {
            System.out.print(course+ "\t");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.next();
        }
        train.showTrainers(names);
    }
}

