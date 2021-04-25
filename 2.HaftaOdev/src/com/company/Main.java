package com.company;

public class Main {

    public static void main(String[] args) {

    MyCourses mycourse1 = new MyCourses();
    mycourse1.id = 1;
    mycourse1.name = "CSS";

    MyCourses mycourse2 = new MyCourses();
    mycourse2.id = 2 ;
    mycourse2.name = "Java";

    MyCourses mycourse3 = new MyCourses(3,"HTML5");

    MyCourses[] courses = {
            mycourse1,
            mycourse2,
            mycourse3
    };

    for(MyCourses course : courses){
        System.out.println(course.name);
    }


    AllCourses course1 = new AllCourses();
    course1.id = 1;
    course1.name = "CSS";

    AllCourses course2 = new AllCourses();
    course2.id = 2;
    course2.name = "Java";

    AllCourses course3 = new AllCourses();
    course3.id = 3;
    course3.name = "HTML";

    AllCourses course4 = new AllCourses();
    course4.id = 4;
    course4.name = "JS";


    CourseManager coursemanager = new CourseManager();
    coursemanager.addCourseToYourList(course4);

    CourseManager yazi = new CourseManager();
    yazi.send("Kamp harika!!!");
    CourseManager yazi2 = new CourseManager();
    yazi2.send("Özellik nesnesi olarak : Kursların adı, Detayları");
    }
}
