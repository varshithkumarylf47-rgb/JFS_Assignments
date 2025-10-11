package com.basics.quest3;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Varshith", "IT");
        int[] studentMarks = {90, 93, 98, 97, 99};
        student.printDetails();
        System.out.println("Grade: " + student.getGrades(studentMarks));
        System.out.println();
        Student student1 = new Student("Shivani", "DS");
        student1.printDetails();
        int[] student1Marks = {50,60,70,77,84};
        System.out.println("Grade: " + student1.getGrades(student1Marks));

    }
}
