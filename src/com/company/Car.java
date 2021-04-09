package com.company;

public class Car {
    final String model;
    final String producer;
    public Double price;

    public Car(String model, String producer, Double price){
        this.producer=producer;
        this.model=model;
        this.price=price;
    }
    public String toString(){
        return model+" "+producer+" "+price;
    }
}
