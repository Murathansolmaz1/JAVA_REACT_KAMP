package com.company;

public class Main {

    public static void main(String[] args) {
        //inheritance
        IndividualCustomer murathan = new IndividualCustomer();
        murathan.customerNumber = "1231231";


        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "22222";

        SendikaCustomer abc = new SendikaCustomer();
        abc.customerNumber = "2342342";

        CustomerManager customerManager = new CustomerManager();
        //customerManager.add(hepsiBurada);
        //customerManager.add(murathan);
        //customerManager.add(abc);

        Customer[] customers = {murathan, hepsiBurada, abc};
        customerManager.addMultiple(customers);


    }
}
