import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Ramzes on 03.04.2015.
 */
public class MyFirstClass {


	public static void main(String[] params) {


		int age = 35;
		int i = -10;
		System.out.println("I'm " + (age + i));


		greatings();
		MySecondMethod();
	}


	public static void greatings() {

		String myfirstVar = "Hello World";
		System.out.println(myfirstVar);
		//32 bit

		//long 64bit
		//long age_loing =2222222222222222222;


		//short 32k
		//byte range  -128 + 127

		byte b = (byte) 255;

		byte c = (byte) 127;
		int i = c;
		System.out.println(i);


		int v = 5 + ++i; // префиксный не юзается
		int vv = 5 + i++; // постфиксный  юзается

		int ii = 2;
		ii += 4;
		System.out.println(ii);

		// &  проверит обе перменные
		// && если первый фелз то второй и не проверит (check1() && check2())
		// || если первый фелз то второй проверит (check1() || check2())
		// & | приоритет  первый более приритетнее


		int r = 455;

		int result = r ^ 20;

		System.out.println(result);
		result = result ^ 20;
		System.out.println(result);

/*
		Scanner scanner = new Scanner(System.in);
//scaner
		if (scanner.hasNextInt()) {
			int intVal = scanner.nextInt();
		}

		if (false) {

		} else if (true) {

		} else {

		}
*/

		//Switch Case

		int month = 5;

		switch (month) {
			case 1:
			case 12:
				System.out.println("Jan");
				break;
			case 2:
				System.out.println("Jan");
				break;
			case 3:
				System.out.println("Jan");
				break;
			case 5:
				System.out.println("Jan");
				break;

			default:
				System.out.println("Wrong month");
				break;

		}

		if (1.1f + 2.2f == 3.3f) {
			System.out.println("It is obvisions");
		} else {
			System.out.println("i should study java harder");
		}


		System.out.println(1.1f + 2.2f);

		float difference = (1.1f + 2.2f) - 3.3f;
		float sigma = 0.01f;


		//abs модуль
		if (Math.abs(difference) <= sigma) {
			System.out.println("equal");
		}


		//  Arrays

		int[] inArray = {1, 2, 3, 4, 5};

		inArray = new int[5];
		inArray = new int[10];

		inArray = Arrays.copyOf(inArray, 20);


		int[] newInArray = {1, 2, 3, 4, 5};

		int q = newInArray[0];

		System.out.println(q);

		newInArray[0] = 10;
		q = newInArray[0];

		System.out.println(q);

		System.out.println(Arrays.toString(newInArray));


		for (int j = 0; newInArray.length > j; j++) {
			System.out.println(newInArray[j]);
		/*
			continue;
			break;
		*/
		}



		for (int element : newInArray) {
			System.out.println(element);
			//System.out.println(newInArray.indexOf(element));

		}


		Scanner scanner = new Scanner(System.in);

// предусловие
		while (!scanner.hasNextInt()) {
			scanner.next();
		}

		int input   = scanner.nextInt();
		System.out.println("in: " + input);

//		do {
//
//		}
//		while (true) {
//
//		}

		Random random = new Random();
		int randomNumber = random.nextInt(100);

		System.out.println(randomNumber);



	}


	public static void MySecondMethod() {


		long i = 123343534535345L;
		float f = 2.5F;

		double height = 172;
		double weight = 78;

		double ratio = weight / height;
		System.out.println("My Ratio " + ratio);


		// площадь и перимерт стороны


	}


}
