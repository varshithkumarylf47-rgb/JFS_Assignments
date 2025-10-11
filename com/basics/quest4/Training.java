package com.basics.quest4;

public class Training {
    String[] showCourses() {
        return new String[]{"java", "springBoot", "python", "sql", "git", "maven"};
    }

    void showTrainers(String... names) {
        System.out.print("Trainer : ");
        for (String name : names) {
            System.out.print(name+" \t");
        }
    }
}
