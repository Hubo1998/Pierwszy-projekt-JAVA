package com.company;

public class Main {

    public static void main(String[] args) {
	int x=0;
	Animal dog = new Animal();
	dog.species ="dog";
	dog.name="Reksio";
	dog.weight=8.0;
	dog.feed();
	dog.feed();

	Phone iPhone = new Phone();
	iPhone.screenSize=4.5;
	iPhone.producer="Apple";
	iPhone.model="6S";
	iPhone.operationSystem="iOs";

	Human me = new Human();
	me.firstName="Hubert";
	me.lastName="Marchwat";
	me.pet=dog;
	System.out.println("Zwierzak ma na imię "+ me.pet.name);
    }
}
