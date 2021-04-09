package com.company;

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
	Car mineCar=new Car("X","Tesla");
	me.Automobile=mineCar;
	System.out.println("My Car is "+mineCar.producer+" "+mineCar.model);
	System.out.println(me.getSalary()+"zł");
	me.setSalary(-41.4);
	me.setSalary(15.0);
	System.out.println(me.getSalary()+"zł");
	//System.out.println("Zwierzak ma na imię "+ me.pet.name);
    }
}
