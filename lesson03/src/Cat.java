import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Ramzes on 10.04.2015.
 */
public class Cat {

	String name;
	int age;
	String vaccines[] = new String[10];
	int vaccineCounter = 0;
	//cont var word (final)
	static final int mawCount = 4;


	/**
	 * inint  with  some one params
	 *
	 * @param name
	 */
	public Cat(String name) {
		this(name, 0);
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String toString() {

		String result = "Cat ";
		result += name + " ";
		result += age + " years";
		result += Arrays.toString(vaccines);
		return result;
	}

	public void acceptVaccine(String vaccine) {
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
		//Cat cat  = new Cat();
		return mawCount;
	}

	public static Cat createCat() {
		return new Cat("Murzik", 12);
	}


}
