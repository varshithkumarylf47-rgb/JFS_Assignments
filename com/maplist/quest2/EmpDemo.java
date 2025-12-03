package com.maplist.quest2;

import java.util.*;

public class EmpDemo {

    public static void main(String[] args) {

        Course course1 = new Course("spring", "jfs");
        Course course2 = new Course("html", "frontend");
        Course course3 = new Course("Java 8", "backend");
        Course course4 = null;
        List<Employee> e1 = List.of(new Employee("John Carter", "IT", "New York"));
        List<Employee> e2 = List.of(new Employee("Emily Davis", "Finance", "Chicago"));
        List<Employee> e3 = List.of(new Employee("Michael Lee", "HR", "San Francisco"));
        Map<Course, List<Employee>> maps = new LinkedHashMap<>();
        maps.put(course1, e1);
        maps.put(course2, e2);
        maps.put(course3, e3);
        maps.put(course4,null);

        for (Course key : maps.keySet()) {
            System.out.println(key + "\n" + maps.get(key));
            System.out.println();
        }

    }
}


