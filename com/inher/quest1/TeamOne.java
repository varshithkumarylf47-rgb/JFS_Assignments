package com.inher.quest1;

public class TeamOne extends Project {
    @Override
    void doTask() {
        System.out.println("Project implemented using Java");
    }

    void softwareUsed(String... tools) {
        System.out.print("Tech Stack : ");
        for (String tool : tools) {
            System.out.print(tool + " ");
        }
    }
}
