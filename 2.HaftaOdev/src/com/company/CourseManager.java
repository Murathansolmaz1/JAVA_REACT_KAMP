package com.company;

public class CourseManager {
    public void addCourseToYourList(AllCourses course){
        System.out.println("Kurs Listenize Eklendi : " + course.name);
    }

    public void send(String yazi){
        System.out.println("Yazınız başarılı bir şekilde gönderildi : " + yazi);
    }
}
