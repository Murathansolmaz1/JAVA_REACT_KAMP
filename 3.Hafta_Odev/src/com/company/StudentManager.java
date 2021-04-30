package com.company;

public class StudentManager extends User{
    public void add(User user){
        System.out.println("Student eklendi : " + user.getName());
    }
}
