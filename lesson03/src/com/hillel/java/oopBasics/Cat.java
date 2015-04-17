package com.hillel.java.oopBasics;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Ramzes on 10.04.2015.
 */
public class Cat {

	private String name;
	private int age;
	private Vaccine vaccines[] = new Vaccine[10];
	private int vaccineCounter = 0;
	//cont var word (final)
	static final int mawCount = 4;
	private String ownerName;


	/**
	 * inint  with  some one params
	 *
	 * @param name
	 */
	public Cat(String name) {
		this(name, 0);
	}

	/**
	 * Constructor
	 */
	public Cat() {

	}

	/**
	 * Get cat name
	 */
	public String getName() {
		//return this.name;
		return name;
	}

	public int getAge() {
		return age;
	}

	/**
	 * get OwnerName
	 *
	 * @return ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * set Owner Name
	 *
	 * @param ownerName
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public  void setAge(int age) {
		int doubleAge = age *2;
		if (age<0) {
			throw new RuntimeException("Iccorect age value: " + age);
		}
		this.age = age;
	}


	public String toString() {

		/* init variables
		int i;

		if (new Random().nextBoolean()) {
			i = 10;
		} else {
			i = 4;
		}
		System.out.println(i);

		область вимость переменной скобки {}
		*/



		String result = "com.hillel.java.oopBasics.Cat ";
		result += name + " ";
		result += age + " years";
		result += Arrays.toString(vaccines);
		return result;
	}

	public void acceptVaccine(Vaccine vaccine) {
		vaccines[vaccineCounter] = vaccine;
		vaccineCounter++;
	}

	public boolean equals(Object other) {

		if (other instanceof Cat) {
			Cat otherCat = (Cat) other;

			if (this.age != otherCat.age) {
				return false;
			}

			if (!this.name.equals(otherCat.name)) {
				return false;
			}

		} else {
			return false;
		}
		return true;
	}

	public static int pawCount() {
		//com.hillel.java.oopBasics.Cat cat  = new com.hillel.java.oopBasics.Cat();
		return mawCount;
	}

	public static Cat createCat() {
		return new Cat("Murzik", 12);
	}


}
