package com.maplist.MapsDemoClassPractice;

public class Department {
    private String deptName;
    private int iD;
    private String deptHead;

    public Department() {
    }

    public Department(String deptName, int iD, String deptHead) {
        this.deptName = deptName;
        this.iD = iD;
        this.deptHead = deptHead;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", iD=" + iD +
                ", deptHead='" + deptHead + '\'' +
                '}';
    }
}
