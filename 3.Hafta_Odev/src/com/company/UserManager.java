package com.company;

public class UserManager extends User{
    public void deleteUser(User user){
        System.out.println("Kullanıcı Silindi : " + user.getName());
    }

    public void deleteMultiple(User[] users){
        for(User user : users){
            deleteUser(user);
        }
    }
}
