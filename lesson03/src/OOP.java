/**
 * Created by Ramzes on 10.04.2015.
 */
public class OOP {


	public static void main(String args[]) {

		//oopIntro();


		Cat cat1 = new Cat("Jerry",2);
		Cat cat2 = new Cat("Tom",2);
		//Cat cat2 = cat1;
		System.out.println("they are equal:" + (cat1 == cat2));

		System.out.println("they are equal :" + (cat1.equals(cat2)));
		// how qeuals 2 methods


	}

	public static void oopIntro() {
		Cat.pawCount();

		Cat cat1 = new Cat("Tom", 2);
		Cat cat2 = new Cat("Murzik", 12);

		cat1.pawCount();


		System.out.println(cat1.toString());
		System.out.println(cat1);

		Vet vet = new Vet();


		vet.registerCat(cat1);
		vet.registerCat(cat2);
		vet.print();


		vet.makeVaccine();
		vet.print();

		System.out.println("jhjhg");
	}


}

