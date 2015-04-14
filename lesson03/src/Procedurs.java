import java.util.AbstractCollection;
import java.util.Arrays;

/**
 * Created by Ramzes on 10.04.2015.
 */
public class Procedurs {

	//cat list
	static String[] vetList = new String[10];

	//total cats
	static int registered = 0;


	public static void main(String[] args) {

		String cat1name = "Tom";
		int cat1age = 2;

		String cat2name = "Murzik";
		int cat2age = 3;

		registerCat(cat1name, cat2age);
		printRegisteredCat();
	}


	public static void printRegisteredCat() {
		System.out.println(Arrays.toString(vetList));
	}


	/**
	 * Method to register cat
	 */
	public static void registerCat(String catName, int catAge) {
		vetList[registered] = catName + " " + catAge;
		registered++;
	}
}
