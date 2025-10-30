package com.interfaceBasics.quest1;

public class EmployeeCourses implements Institute {

    @Override
    public String[] showCourses() {
        return new String[]{"Jenkins", "Agile", "Cloud", "spring"};
    }
}
