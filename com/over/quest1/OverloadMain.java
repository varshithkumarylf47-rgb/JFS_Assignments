package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Employee name: ");
        String name1= scanner.next();
        System.out.print("Designation(manager/programmer/director): ");
        String designation1 = scanner.next();
        System.out.println();
        Employee employee = new Employee(name1,designation1);
        if(designation1.equalsIgnoreCase("programmer")){
            employee.calcBonus(233);
        }if(designation1.equalsIgnoreCase("manager")){
            employee.calcBonus(234,"iphone");
        }if(designation1.equalsIgnoreCase("director")){
            employee.calcBonus(123,"iphone",314);
        }
    }
}
