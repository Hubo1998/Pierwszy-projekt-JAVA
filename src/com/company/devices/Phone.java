package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public class Phone extends Device implements Sellable {
    final Double screenSize;
    final String operationSystem;
    final static public String defaultAdr="192.168.0.1";
    final static public String defaultpro="255.255.255.255";
    final static public String defaultname="defaultversionname";

    public Phone(String producer, String model, Double screenSize, String operationSystem, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Naduszam guzika");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this){
            System.out.println("Nie można sprzedać czegoś czego się nie ma");
        } else if(buyer.cash<price){
            System.out.println("Nie stać Cię");
        } else {
            seller.cash+=price;
            buyer.cash-=price;
            buyer.phone= seller.phone;
            seller.phone=null;
            System.out.println("Transakcja przebiegła pomyślnie");
        }
    }
    //public void installAnnApp(){

    //}
}
