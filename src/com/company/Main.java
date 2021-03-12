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
	//System.out.println("Zwierzak ma na imię "+ me.pet.name);
    }
}
