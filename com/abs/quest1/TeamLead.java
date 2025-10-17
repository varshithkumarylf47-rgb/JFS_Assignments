package com.abs.quest1;

public abstract class TeamLead extends Employee {

    public TeamLead(String empName, double salary, int empId) {
        super(empName, salary, empId);
    }

    @Override
    void calcBonus(double amount) {
        System.out.println("Bonus: " + amount);
    }

    void corporateServices() {
        System.out.println("Corporate Services of Team Lead\nOverseeing operations\nManaging team performance and development");
    }

}

