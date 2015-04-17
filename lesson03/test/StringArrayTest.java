import com.hillel.java.improveArray.StringArray;
import org.junit.Test;

/**
 * Created by Ramzes on 17.04.2015.
 */
public class StringArrayTest {

	public  void main(String[] args) {
		StringArray array = new StringArray();

		System.out.println("Empty array: " +array);
		System.out.println("Empty array size: " + array.size());


		array.add("first");
		System.out.println("one element: " + array);
		System.out.println("One array size: " + array.size());

		array.add("second");

		System.out.println("second element: " + array);
		System.out.println("second array size: " + array.size());


		System.out.println("First element: " + array.get(0));
		System.out.println("Second element: " + array.get(1));

		array.get(2);
	}

	@Test
	public void asd () {
		System.out.println("test is runnig");
	}

	@Test
	public void asdd () {
		System.out.println("test is runnig2");
	}
}
