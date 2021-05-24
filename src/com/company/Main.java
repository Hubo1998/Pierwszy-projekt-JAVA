package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
		int x = 0;
		Pet dog = new Pet("dog");

		dog.feed();
		dog.feed();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.feed();
		dog.takeForAWalk();
		dog.feed();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.feed();
		dog.takeForAWalk();
		Phone iPhone = new Phone("Apple", "6s", 4.5, "iOS", 2020);


		Human me = new Human();
		me.firstName = "Hubert";
		me.lastName = "Marchwat";
		me.pet = dog;
		me.pet.takeForAWalk();
		me.pet.feed();
		//Car mineCar=new Car("X","Tesla");
		//me.Automobile=mineCar;
		//System.out.println("My Car is "+mineCar.producer+" "+mineCar.model);
		System.out.println(me.getSalary() + "zł");
		me.setSalary(-41.4);
		me.setSalary(15000.0);
		System.out.println(me.getSalary() + "zł");

		//System.out.println("Zwierzak ma na imię "+ me.pet.name);
		System.out.println(me.getCar());
		Car car1 = new Diesel("Ibiza", "Seat", 999.0, 2004);
		Car car2 = new LPG("Leon", "Seat", 20000.0, 2001);
		me.setCar(car1);
		//System.out.println(me.getCar());
		me.setCar(car2);
		if (car1 == car2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(me);
		System.out.println(dog);
		Phone telephone=new Phone("Japko","4",5.59,"Ajoes",2009);
		iPhone.turnOn();
		System.out.println(telephone.producer);
		System.out.println(car1.model);
		telephone.turnOn();
		car1.turnOn();
		Human me1=new Human();
		me1.pet=new Pet("dog");
		me1.cash=0.0;

		Human me2=new Human();
		me2.cash=2000.0;
		me1.pet.sell(me1,me2,20000.0);
		me1.phone=new Phone("Apple","Ip 6s",5.0,"iOS",2016);
		me1.phone.sell(me1,me2,200.0);
		car1.refuel();
		car2.refuel();
		Car car3=new Electric("X","Tesla",999999.0,2020);
		car3.refuel();
	}

}
