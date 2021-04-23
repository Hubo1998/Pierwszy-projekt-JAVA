package com.company;

import java.io.File;

public class Animal implements Sellable {
    public String toString(){
        return name+" "+weight;
    }


    final public String species;
    private Double weight;
    public String name;
    public File pic;
    private static final double DEFAULT_WALK_WEIGHT = 1;
    static final public double ANIMAL_WEIGHT=1.0;
    static final public double DOG_WEIGHT=5.0;
    static final public double CAT_WEIGHT=2.0;
    static final public double COW_WEIGHT=250.0;
    static final public double DEFAULT_FOOD_WEIGHT=1.0;

    public Animal(String species) {
        this.species = species;

        switch(this.species){
            case"dog":
                this.weight=DOG_WEIGHT;
                break;
            case"cat":
                this.weight=CAT_WEIGHT;
                break;
            case"cow":
                this.weight=COW_WEIGHT;
                break;
            default:
                this.weight=ANIMAL_WEIGHT;
                break;
        }


    }
    void feed(){
        if(weight>=0){
            weight+=DEFAULT_FOOD_WEIGHT;
            System.out.println("Thx human, now my weight is "+weight);
        }
        else{
            System.out.println("Food won't make me alive Human");
        }

    }
    void takeForAWalk(){
        if (weight>=0){
            weight-=DEFAULT_WALK_WEIGHT;
            System.out.println("Thx for a walk, now my weight is "+weight);
            if(weight<0){
                System.out.println("Ehhhh Human... i'm too thin");
            }
        }
        else {
            System.out.println("i can't walk when i'm dead Human");
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet!=this){
            System.out.println("Nie można sprzedać czegoś czego się nie ma");
        } else if(buyer.cash<price){
            System.out.println("Nie stać Cię");
        } else {
            seller.cash+=price;
            buyer.cash-=price;
            buyer.pet= seller.pet;
            seller.pet=null;
            System.out.println("Transakcja przebiegła pomyślnie");
        }

    }
}
