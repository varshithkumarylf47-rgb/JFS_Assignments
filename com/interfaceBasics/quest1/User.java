package com.interfaceBasics.quest1;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Employee\n2.Student\nSelect an option: ");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                Institute  institute = new EmployeeCourses();
                String[] courses = institute.showCourses();
                System.out.println("Courses for Employee");
                for(String course : courses){
                    System.out.println(course);
                }
                break;
            case 2:
                institute = new StudentCourses();
                courses = institute.showCourses();
                System.out.println("Courses for Student");
                for(String course : courses){
                    System.out.println(course);
                }
                break;
            default:
                System.out.println("Select a valid option");
                break;
        }
    }
}
