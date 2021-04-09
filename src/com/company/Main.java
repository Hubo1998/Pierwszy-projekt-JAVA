package com.company;


public class Main {

    public static void main(String[] args) {
	int x=0;
	Animal dog = new Animal("dog",3.2,"Milek");

	dog.feed();
	dog.feed();

	Phone iPhone = new Phone("Apple","6s",4.5,"iOS");


	Human me = new Human();
	me.firstName="Hubert";
	me.lastName="Marchwat";
	me.pet=dog;
	System.out.println("Zwierzak ma na imię "+ me.pet.name);
	System.out.println(me.getSalary()+"zł");
	me.setSalary(-41.4);
	me.setSalary(15.0);
	System.out.println(me.getSalary()+"zł");
    }
}
