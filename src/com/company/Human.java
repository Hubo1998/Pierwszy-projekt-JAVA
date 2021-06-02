package com.company;
import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;

public class Human {;
    public String toString(){
        return firstName+" "+lastName;
    }
    String firstName;
    String lastName;
    public Phone phone;
    public Pet pet;
    private Double salary=2999.0;
    public Car[] garage;
    public Double cash;
    final static public int DEFAULT_GARAGE_SIZE=2;

    public Human(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.garage=new Car[DEFAULT_GARAGE_SIZE];
    }

    public Car getCar(int place){
        return this.garage[place-1];
    }
    void setCar(Car automobile) {
        if (automobile.price < salary) {
            for (int i = 0; i < garage.length; i++) {
                if (garage[i] == null) {
                    garage[i]=automobile;
                    break;
                } else {
                    System.out.println("Miejsca zajęte");
                }
            }
        } else if (automobile.price / 12 < salary) {
            System.out.println("Kupiony na kredyt");
            for (int i = 0; i < garage.length; i++) {
                if (garage[i] == null) {
                    garage[i]=automobile;
                    break;
                } else {
                    System.out.println("Miejsca zajęte");
                }
            }
        } else {
            System.out.println("Studia Panie");
        }
    }
    public Double getGarageValue(){
            Double value=0.0;
            for (int i=0;i<garage.length;i++){
                if(garage[i].value!=null){
                    value+=garage[i].value;
                }
            }
            return value;
        }
    double getSalary(){
        System.out.println(java.time.LocalDateTime.now()+"-Date");
        System.out.println("before:"+salary);
        return this.salary;
    }
    void setSalary(double salary){
        if (salary<0){
            System.out.println("Płaca na minusie to uczciwa cena");
        }
        else{
            System.out.println("Nowe dane wysłane do księgowej");
            System.out.println("Aneks do odebrania od Hani z kadr");
            System.out.println("Spoko ZUS i US już wiedzą :)");
            this.salary=salary;
        }
    }

    public boolean hasCar(Car newCar) {
        for(Car car:garage){
            if(car == newCar)
                return true;
        }
        return false;
    }

    public boolean hasFreeParkingLot() {
        for(Car car:garage){
            if(car == null)
                return true;
        }
            return false;
    }

    public void removeCar(Car carToRemove) {
        for(int i=0;i<garage.length;i++){
            if(garage[i]==carToRemove)
                garage[i]=null;
        }
    }

    public void addCar(Car newCar) {
        for(int i=0;i<garage.length;i++){
            if(garage[i]==null) {
                garage[i] = newCar;
                return;
            }
        }
    }

    public void sortCars(){
        Arrays.sort(garage,new ProductionYearCarComparator());
    }
}
