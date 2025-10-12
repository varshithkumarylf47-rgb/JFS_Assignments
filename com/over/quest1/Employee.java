package com.over.quest1;

public class Employee {
    String name;
    String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void calcBonus(double basicAllowance) {
        System.out.println("designation is Programmer");
    }

    void calcBonus(double basicAllowance, String gift) {
        System.out.println("designation is Manager");
    }

    void calcBonus(double basicAllowance, String gift, double houseAllowance) {
        System.out.println("designation is Director");
    }
}
