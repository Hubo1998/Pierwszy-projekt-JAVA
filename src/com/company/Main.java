package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
	int x=0;
	Animal dog = new Animal("dog");

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
		Phone iPhone = new Phone("Apple","6s",4.5,"iOS");


	Human me = new Human();
	me.firstName="Hubert";
	me.lastName="Marchwat";
	me.pet=dog;
	me.pet.takeForAWalk();
	me.pet.feed();
	//Car mineCar=new Car("X","Tesla");
	//me.Automobile=mineCar;
	//System.out.println("My Car is "+mineCar.producer+" "+mineCar.model);
	System.out.println(me.getSalary()+"zł");
	me.setSalary(-41.4);
	me.setSalary(15000.0);
	System.out.println(me.getSalary()+"zł");

	//System.out.println("Zwierzak ma na imię "+ me.pet.name);
	System.out.println(me.getCar());
	Car car1= new Car ("Ibiza","Seat",999.0);
	Car car2=new Car("Leon", "Seat",20000.0);
	me.setCar(car1);
	//System.out.println(me.getCar());
	me.setCar(car2);
	if (car1==car2){
		System.out.println("1");
	}else{
		System.out.println("0");
	}
	System.out.println(car1);
	System.out.println(car2);
	System.out.println(me);
	System.out.println(dog);
    }

}
