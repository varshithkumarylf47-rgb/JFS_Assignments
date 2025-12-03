package com.maplist.MapsDemoClassPractice;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        Map<Department, List<Student>> map = new LinkedHashMap<>();

        Department dept1 = new Department("ECE", 204, "Narayana");
        Department dept2 = new Department("CSE", 201, "Lakshmi");
        Department dept3 = new Department("CIVIL", 207, "Suresh");
        Department dept4 = new Department("FORENSICS", 111, "Elon Musk");


        List<Student> eceStudents = Arrays.asList(
                new Student("Varshith", 46, "Hyderabad"),
                new Student("Samanth", 49, "Benguluru"),
                new Student("Sunil", 50, "Medchal")
        );
        List<Student> cseStudents = Arrays.asList(
                new Student("Arun", 11, "Hyderabad"),
                new Student("Varun", 16, "Benguluru"),
                new Student("Karun", 53, "Medchal")
        );
        List<Student> civilStudents = Arrays.asList(
                new Student("vijay", 36, "Hyderabad"),
                new Student("ajay", 32, "Benguluru"),
                new Student("kajol", 20, "Medchal")
        );

        map.put(dept1, eceStudents);
        map.put(dept2, cseStudents);
        map.put(dept3, civilStudents);
        map.put(dept4, null);

        System.out.println();
        Set<Department> keys = map.keySet();
        keys.forEach(System.out::println);
        System.out.println();

        for (Department key : keys) {
            System.out.println(key.getDeptName());
            if (map.get(key) == null ){
                map.putIfAbsent(key,Arrays.asList(new Student("Ravi",222,"Madras"),new Student("Rajamouli", 1,"Mahismathi")));
            }
            map.get(key).forEach(System.out::println);
            System.out.println();
        }
    }
}
