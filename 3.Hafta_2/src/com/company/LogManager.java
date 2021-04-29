package com.company;

public class LogManager {


    //Low Code
    public void log(int logType){
        if(logType == 1){
            System.out.println("Veritabanı Loglandı");
        }
        else if(logType == 2){
            System.out.println("Dosya Loglandı");
        }
        else{
            System.out.println("Email loglandı");
        }
    }
}

// 1 - Database
// 2 - File
// 3 - Email