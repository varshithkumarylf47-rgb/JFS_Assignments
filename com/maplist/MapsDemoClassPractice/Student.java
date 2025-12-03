package com.maplist.MapsDemoClassPractice;

public class Student {
    private String studName;
    private int studID;
    private String city;

    public Student() {
    }

    public Student(String studName, int studID, String city) {
        this.studName = studName;
        this.studID = studID;
        this.city = city;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getStudID() {
        return studID;
    }

    public void setStudID(int studID) {
        this.studID = studID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studName='" + studName + '\'' +
                ", studID=" + studID +
                ", city='" + city + '\'' +
                '}';
    }
}
