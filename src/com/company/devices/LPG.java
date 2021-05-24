package com.company.devices;

public class LPG extends Car{
    public LPG(String model, String producer, Double price, Integer yearOfProduction) {
        super(model, producer, price, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Uzupełnianie kuchenki");
    }
}
