package com.company;

public class Main {

    public static void main(String[] args) {

        Instructor person1 = new Instructor();
        person1.setName("Engin Demiroğ");
        person1.setId(123);
        person1.setJob("Software Developer");
        System.out.println(person1.getJob());

        IntructorManager abc = new IntructorManager();
        abc.add(person1);

        System.out.println("**********************************************************");

        Student student1 = new Student();
        student1.setName("Murathan Solmaz");
        student1.setId(456);
        student1.setDepartment("Computer Engineering");
        System.out.println(student1.getDepartment());

        StudentManager abc2 = new StudentManager();
        abc2.add(student1);

        System.out.println("**********************************************************");

        Student student2 = new Student();
        student2.setName("Simge");
        student2.setId(999);
        student2.setDepartment("Computer Engineering");
        System.out.println(student2.getDepartment());

        StudentManager abc3 = new StudentManager();
        abc3.add(student2);

        System.out.println("**********************************************************");

        UserManager manager = new UserManager();

        User[] users = {person1,student1,student2};
        manager.deleteMultiple(users);
    }
}
