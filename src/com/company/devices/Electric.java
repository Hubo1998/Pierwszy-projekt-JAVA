package com.company.devices;

public class Electric extends Car {
    public Electric(String model, String producer, Double price, Integer yearOfProduction) {
        super(model, producer, price, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("ładowanie");
    }
}
