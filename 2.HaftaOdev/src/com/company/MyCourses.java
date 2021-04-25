package com.company;

public class MyCourses {

    public MyCourses(){
        System.out.println("Kurslarınız");
    }

    public MyCourses(int id,String name){
        this.id = id;
        this.name = name;
        System.out.println("Kurslarınız");
    }

    int id;
    String name;
}
