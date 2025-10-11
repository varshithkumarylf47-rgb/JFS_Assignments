package com.inher.quest1;

public class CompanyMain {
    public static void main(String[] args) {
        Project project =new TeamOne();
        project.doTask();
        TeamOne teamOne = (TeamOne) project;
        teamOne.softwareUsed("eclipse","Jenkins","maven");
        System.out.println("\n");
        project = new TeamTwo();
        project.doTask();
        TeamTwo teamTwo = (TeamTwo) project;
        System.out.print("Tech Stack : ");
        for(String techStack : teamTwo.getTechStack()){
            System.out.print(techStack+ " ");
        }

    }
}
