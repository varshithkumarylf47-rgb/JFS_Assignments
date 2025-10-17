package com.abs.quest1;

import java.util.Scanner;

public class DemoAbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select your role\n1.Manager\n2.Team Lead\n3.Developer\nSelect (1) or (2) or (3) : ");

        int option = scanner.nextInt();
        Employee employee;
        switch (option) {
            case 1:
                System.out.print("Enter name: ");
                String nameM = scanner.next().toUpperCase();
                System.out.print("Enter Employee ID: ");
                int iDM = scanner.nextInt();
                System.out.print("Enter salary: ");
                double salaryM = scanner.nextDouble();
                System.out.print("Enter activity: ");
                String activityM = scanner.next();
                System.out.println();

                employee = new Manager(nameM, salaryM, iDM, activityM);
                employee.printDetails();
                employee.calcBonus(10000);
                System.out.println();
                employee.showProjects();
                System.out.println();
                String[] courses = employee.showCourses();
                if (courses != null) {
                    System.out.println("Courses for Manager");
                    for (String course : courses) {
                        System.out.println(course);
                    }
                }
                System.out.println();
                employee.showRules();
                System.out.println();

                Manager manager = (Manager) employee;
                manager.funClub();
                break;

            case 2:
                System.out.print("Enter name: ");
                String nameTL = scanner.next();
                System.out.print("Enter Employee ID: ");
                int iDTL = scanner.nextInt();
                System.out.print("Enter salary: ");
                double salaryTL = scanner.nextDouble();
                System.out.println();
                employee = new Developer(nameTL, salaryTL, iDTL, null);
                employee.printDetails();
                employee.calcBonus(7000);
                System.out.println();
                employee.showProjects();
                System.out.println();
                employee.showRules();//2
                System.out.println();
                TeamLead teamLead = (TeamLead) employee;
                teamLead.corporateServices();
                System.out.println();
                String[] coursesTL = teamLead.showCourses();
                if (coursesTL != null) {
                    System.out.println("Courses for Manager");
                    for (String course : coursesTL) {
                        System.out.println(course + " ");
                    }
                } else {
                    System.out.println("No courses available");
                }
                break;
            case 3:
                System.out.print("Enter name: ");
                String nameD = scanner.next();
                System.out.print("Enter Employee ID: ");
                int iDD = scanner.nextInt();
                System.out.print("Enter salary: ");
                double salaryD = scanner.nextDouble();
                System.out.print("Enter 3 Hobbies: ");
                String[] hobbies = new String[3];
                for (int i = 0; i < hobbies.length; i++) {
                    hobbies[i] = scanner.next();
                }
                System.out.println();
                employee = new Developer(nameD, salaryD, iDD, hobbies);
                employee.printDetails();
                employee.calcBonus(3000);
                System.out.println();
                employee.showProjects();
                System.out.println();
                employee.showRules();
                System.out.println();
                String[] coursesD = employee.showCourses();
                if (coursesD != null) {
                    System.out.println("Courses for Developer");
                    for (String course : coursesD) {
                        System.out.println(course);
                    }
                } else {
                    System.out.println("No courses available");
                }
                System.out.println();
                Developer developer = (Developer) employee;
                developer.showHobbies(hobbies);
                break;
        }
    }
}
