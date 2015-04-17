package com.hillel.java.oopBasics;

/**
 * Created by Ramzes on 10.04.2015.
 */
public class OOP {


	public static void main(String args[]) {

		oopIntro();
		new OOP().negativeAge();
		//negativeAge();
/*
		Cat cat1 = new Cat("Jerry",2);
		Cat cat2 = new Cat("Tom",2);
		//com.hillel.java.oopBasics.Cat cat2 = cat1;
		System.out.println("they are equal:" + (cat1 == cat2));
// how qeuals 2 methods
		System.out.println("they are equal :" + (cat1.equals(cat2)));

*/




	}

	public static void oopIntro() {
		Cat.pawCount();

		Cat cat1 = new Cat("Tom", 2);
		Cat cat2 = new Cat("Murzik", 12);
		Cat cat3 = null; //  set exeption



		cat1.pawCount();


		System.out.println(cat1.toString());
		System.out.println(cat1);

		Vet vet = new Vet();


		vet.registerCat(cat1);
		vet.registerCat(cat2);
		vet.registerCat(cat3);
		vet.print();


		vet.makeVaccine();
		vet.print();


	}

	public  void negativeAge() {
		Cat cat = new Cat();

		cat.setAge(-10);
		System.out.println("this message will be never printed");

	}


}

