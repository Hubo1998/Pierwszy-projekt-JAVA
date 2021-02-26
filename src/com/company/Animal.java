package com.company;

import java.io.File;

public class Animal {


    final public String species;
    private Double weight;
    public String name;
    public File pic;

    public Animal(String species, Double weight, String name) {
        this.species = species;
        this.weight = weight;
        this.name = name;
        //this.pic = pic;
    }
    void feed(){
        weight+=1;
        System.out.println("Thx human");
    }
}
