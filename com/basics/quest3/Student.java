package com.basics.quest3;

public class Student {
    String name;
    String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void printDetails() {
        System.out.println("Name: " + name + "\nDepartment: " + department);
    }

    String getGrades(int[] marks) {
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        int sum = 0;
        int average = 0;
        for (int value : marks) {
            sum = sum + value;
        }
        average = sum / marks.length + 1;
        System.out.println("\nSum: " + sum + "\nAverage: " + average);
        if (average > 90 && average <= 100) {
            return "A";
        }
        if (average > 80 && average <= 90) {
            return "B";
        }
        if (average > 70 && average <= 80) {
            return "C";
        }
        if (average >= 60 && average <= 70) {
            return "D";
        }
        if (average > 50 && average <= 59) {
            return "E";
        } else {
            return "Fail";
        }
    }
}
