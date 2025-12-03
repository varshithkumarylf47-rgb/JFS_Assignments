package com.maplist.quest2;

public class Course {
    private String courseName;
    private String type;

    public Course(String courseName, String type) {
        this.courseName = courseName;
        this.type = type;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
