package com.company;

public class Student extends User{

    private String department;

    public String getDepartment() {
        return "Student's department : " + department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
