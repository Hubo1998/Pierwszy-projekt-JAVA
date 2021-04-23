package com.company.devices;

public class Car extends Device {
    public Double price;

    public Car(String model, String producer, Double price,Integer yearOfProduction){
        super(producer,model,yearOfProduction);
        this.price=price;
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyka");
    }
}
