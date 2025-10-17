package com.abs.quest1;

public abstract class Employee {
    String empName;
    double salary;
    int empId;
    final String COMPANYNAME= "SHRISTI TECH ACADEMY";

    public Employee(String empName, double salary, int empId) {
        this.empName = empName;
        this.salary = salary;
        this.empId = empId;
    }
    void printDetails() {
        System.out.println("Name:" + empName);
        System.out.println("Salary:" + salary);
        System.out.println("Employee ID:" + empId);
        System.out.println("Company Name: "+COMPANYNAME);

    }


    abstract void calcBonus(double amount);

    abstract void showProjects();

    String[] showCourses() {
        return new String[]{"java", "git", "springBoot", "maven", "jUnit testing"};
    }


    private void officeHours() {
        System.out.println("Office Hours: 14 hours per day");
    }

    final void showRules() {
        System.out.println("Rules");
        officeHours();
        System.out.println("Leave Policies : Max 15 days per year");
        System.out.println("OD policies");
    }



}
