package com.company.devices;

public class Device {
    final public String model;
    final public String producer;
    final public Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer=producer;
        this.model=model;
        this.yearOfProduction=yearOfProduction;
    }
    @Override
    public String toString(){
        return model+" "+producer+" "+yearOfProduction;
    }
    public void turnOn(){
        System.out.println("wł/wył");
        }
    }
