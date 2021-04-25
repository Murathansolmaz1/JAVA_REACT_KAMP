package com.company;

public class Product {
    int id;
    String name;
    double unitPrice;
    String detail;

    public Product(){
        System.out.println("Ben çalıştım");
    }

    public Product(int id, String name, double unitPrice, String detail){
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.unitPrice = unitPrice;
    }

}
