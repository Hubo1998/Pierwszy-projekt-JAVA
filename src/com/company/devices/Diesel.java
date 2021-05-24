package com.company.devices;

public class Diesel extends Car{
    public Diesel(String model, String producer, Double price, Integer yearOfProduction) {
        super(model, producer, price, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Tankowanie samochodu");
    }
}
