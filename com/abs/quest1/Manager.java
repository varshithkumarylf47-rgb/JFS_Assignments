package com.abs.quest1;

public class Manager extends Employee{
    String activity;

    public Manager(String empName, double salary, int empId, String activity) {
        super(empName, salary, empId);
        this.activity = activity;
    }

    @Override
    void calcBonus(double amount) {
        System.out.println("Bonus for Manager: "+ (amount));
    }

    @Override
    void showProjects() {
        System.out.println("Manager handles: Budget Allocation, Team Management.");
    }

    @Override
    String[] showCourses() {
        return new String[] {"Project Management Professional (PMP)","Certified ScrumMaster (CSM)","Certified Six Sigma Black Belt"};
    }

    void funClub(){
        System.out.println("Activity of Manager: "+activity);
    }

}
