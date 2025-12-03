package com.maplist.quest3list;

public class Employee {
    private String name;
    private int employeeId;
    private String city;

    public Employee() {
    }

    public Employee(String name, int employeeId, String city) {
        this.name = name;
        this.employeeId = employeeId;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", city='" + city + '\'' +
                '}';
    }
}
