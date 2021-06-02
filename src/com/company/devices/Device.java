package com.company.devices;

public abstract class Device {
    final public String model;
    final public String producer;
    final public Integer yearOfProduction;
    public Double value;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer=producer;
        this.model=model;
        this.yearOfProduction=yearOfProduction;
    }
    @Override
    public String toString(){
        return model+" "+producer+" "+yearOfProduction;
    }
    abstract public void turnOn();
    }
