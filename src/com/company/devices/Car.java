package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public class Car extends Device implements Sellable {
    public Double price;

    public Car(String model, String producer, Double price,Integer yearOfProduction){
        super(producer,model,yearOfProduction);
        this.price=price;
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyka");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.automobile != this){
            System.out.println("Nie można sprzedać czegoś czego się nie ma");
        } else if(buyer.cash<price){
            System.out.println("Nie stać Cię");
        } else {
            seller.cash+=price;
            buyer.cash-=price;
            buyer.automobile= seller.automobile;
            seller.automobile=null;
            System.out.println("Transakcja przebiegła pomyślnie");
        }
    }
}
