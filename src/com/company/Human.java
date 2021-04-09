package com.company;
import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    String phone;
    Animal pet;
    private Double salary=2999.0;
    private Car Automobile;

    public Car getCar(){
        return this.Automobile;
    }
    void setCar(Car Automobile){
        if (Automobile.price< salary){
            System.out.println("Kupiony za gotówkę");
            this.Automobile=Automobile;
        } else if(Automobile.price/12<salary) {
            System.out.println("Kupiony na kredyt");
        } else{
            System.out.println("Studia Panie");
        }

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
}
