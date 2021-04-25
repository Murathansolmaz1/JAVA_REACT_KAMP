package com.company;

public class Main {

    public static void main(String[] args) {

        String internetSubeButonu = "Murathan";

        System.out.println(internetSubeButonu);
        double dolarDun = 8.15;
        int vade = 36;
        double dolarBugun = 8.20;
        boolean dustuMu = false;

        if(dolarBugun<dolarDun){
            System.out.println("Dolor düştü");
        }
        else{
            System.out.println("Dolar arttı");
        }

        String[] krediler ={
                "Hızlı kredi",
                "Mutlu emekli kredi",
                "Konut kredisi"
        };

        for(String kredi : krediler){
            System.out.println(kredi);
        }
    }
}
