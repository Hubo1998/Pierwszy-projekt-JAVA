package com.company.devices;

import com.company.Human;
import com.company.Sellable;

import java.util.ArrayList;

public abstract class Car extends Device implements Sellable {
    public Double price;
    public ArrayList<Human> ownersList = new ArrayList<>();

    public Car(String model, String producer, Double price,Integer yearOfProduction){
        super(producer,model,yearOfProduction);
        this.price=price;
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyka");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this))
            throw new Exception("Sprzedawca nie ma auta");
        if(!buyer.hasFreeParkingLot())
            throw new Exception("Nie ma miejsca");
        if(buyer.cash<price)
            throw new Exception("kupujący nie ma kasy");
        if(ownersList.get(ownersList.size()-1)==seller)
            throw new Exception("Sprzedający nie jest ostatnim właścicielem");
        seller.removeCar(this);
        buyer.addCar(this);
        ownersList.add(buyer);
        seller.cash+=price;
        buyer.cash+=price;

        System.out.println("Sprzedano");
    }
    abstract public void refuel();

    //sprawdzenie obecnego właściciela
    public Human currentOwner(){
        if (ownersList.isEmpty()){
            return null;
        }else{
            return ownersList.get(ownersList.size()-1);
        }
    }
    //sprawdzenie czy dana osoba była właścicielem
    public boolean wasOwner(Human someguy){
        return ownersList.contains(someguy);
    }

    //liczba transakcji, jeżeli nabycie samochodu możemy zaliczyć także do transakcji, jeżeli nie to -1.
    public int howManyTimes(){
        return ownersList.size();
    }

    //jeżeli oboje znajdują się na liście właścicieli to musieli ze sobą handlować.
    public boolean didTheyTradin(Human buyer,Human seller){
        return ownersList.contains(buyer) & ownersList.contains(seller);
    }
}
