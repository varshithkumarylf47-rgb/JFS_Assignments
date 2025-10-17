package com.abs.quest1;

public class Developer extends TeamLead {
    String[] hobbies;

    public Developer(String empName, double salary, int empId, String[] hobbies) {
        super(empName, salary, empId);
        this.hobbies = hobbies;
    }

    @Override
    void showProjects() {
        System.out.println("Projects: Backend Development, API Integration, and Testing.");
    }

    @Override
    String[] showCourses() {
        return new String[]{"AWS Certified Developer – Associate", "Microsoft Certified: Azure Developer Associate","Google Cloud Professional Developer"};
    }


    void showHobbies(String[] hobbies) {
        System.out.println("Hobbies of Developer");
        for (String hobby : hobbies) {
            System.out.println(hobby + " is hobby.");
        }
    }



}
