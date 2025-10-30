package com.interfaceBasics.quest1;

public class StudentCourses implements Institute {

    @Override
    public String[] showCourses() {
        return new String[]{"python", "java", "angular", "spring"};
    }
}
