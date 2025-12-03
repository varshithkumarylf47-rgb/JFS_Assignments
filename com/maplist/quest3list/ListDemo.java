package com.maplist.quest3list;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


public class ListDemo {
    public static void main(String[] args) {

        Employee employee;
        List<Employee> employees = asList(
                new Employee("Alice Johnson", 101, "Boston"),
                new Employee("Brian Stevens", 102, "Miami"),
                new Employee("Catherine Miller", 103, "Denver"),
                new Employee("David Thompson", 104, "Boston"),
                new Employee("Eva Ramirez", 105, "Boston")
        );
        System.out.println("List of all employees");
        employees.forEach(System.out::println);
        System.out.println();

        List<Employee> employeesbyCity = new ArrayList<>();

        for (Employee emp : employees) {
            if (emp.getCity().equals("Boston")) {
                employeesbyCity.add(emp);
            }
        }
        System.out.println("List of all employees from BOSTON");
        employeesbyCity.forEach(System.out::println);
    }
}
