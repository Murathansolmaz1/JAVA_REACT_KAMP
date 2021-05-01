package com.company;

public class Main {

    public static void main(String[] args) {
        // İnterfaces

        Logger[] loggers = {new SmsLogger(),
                            new DatabaseLogger(),
                            new EmailLogger()       };

        CustomerManager customerManager = new CustomerManager(loggers);


        Customer murathan = new Customer(1, "Murathan", "Solmaz");
        customerManager.add(murathan);
    }
}
