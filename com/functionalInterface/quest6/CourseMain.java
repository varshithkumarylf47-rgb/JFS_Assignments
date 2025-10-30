package com.functionalInterface.quest6;

import java.util.Scanner;

public class CourseMain {
    public static void main(String[] args) {
        ICourses iCourses;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.FrontEnd\n2.BackEnd\n3.DataBases\nChoose any one of the course from above: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.print("Enter the type -> Design/Development: ");
                String frontType = scanner.next();
                iCourses = (type) -> switch (type.toLowerCase()) {
                    case "design" -> new String[]{"html", "css", "Bootstrap", "material"};
                    case "development" -> new String[]{"html", "css", "react", "angular"};
                    default -> new String[]{"no courses available"};
                };
                printArray(iCourses.printCourses(frontType));
                break;

            case 2:
                System.out.print("Enter the type -> Java/Python: ");
                String backType = scanner.next();
                iCourses = (type) -> switch (type.toLowerCase()) {
                    case "java" -> new String[]{"Spring", "Hibernate"};
                    case "python" -> new String[]{"Django", "Flask"};
                    default -> new String[]{"no courses available"};
                };
                printArray(iCourses.printCourses(backType));
                break;

            case 3:
                System.out.print("Enter the type -> SQL/NoSQL: ");
                String dbType = scanner.next();
                iCourses = (type) -> switch (type.toLowerCase()) {
                    case "sql" -> new String[]{"MySQL", "Oracle"};
                    case "nosql" -> new String[]{"MongoDB", "CouchDB"};
                    default -> new String[]{"no courses available"};
                };
                printArray(iCourses.printCourses(dbType));
                break;

            default:
                System.out.println("Invalid option!");
        }

        scanner.close();
    }

    private static void printArray(String[] courses) {
        for (String course : courses) {
            System.out.println(course);
        }
    }
}
