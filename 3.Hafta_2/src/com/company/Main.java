package com.company;

public class Main {

    public static void main(String[] args) {
	LogManager logManager = new LogManager();
	//Low Code
	logManager.log(1);
    logManager.log(2);
    logManager.log(3);


    //Better Code
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new EmailLogger());

    }
}
