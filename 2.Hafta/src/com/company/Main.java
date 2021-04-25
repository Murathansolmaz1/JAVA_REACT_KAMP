package com.company;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1, "Lenevo V14", 15000, "16GB RAM");
        product1.id = 1;
        product1.name = "Lenevo V14";
        product1.unitPrice = 15000;
        product1.detail = "16GB RAM";

        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Lenevo V15";
        product2.unitPrice = 16000;
        product2.detail = "32GB RAM";

        Product product3 = new Product();
        product3.id = 3;
        product3.name = "Lenevo V16";
        product3.unitPrice = 17000;
        product3.detail = "48GB RAM";

        Product[] products = {
                product1,
                product2,
                product3
        };

        for (Product product : products){
            System.out.println(product.name);
        }

        System.out.println(products.length);


        Category category1 = new Category();

        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 1;
        category2.name = "Bilgisayar";


        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);


    }
}
