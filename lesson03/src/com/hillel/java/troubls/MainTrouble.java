package com.hillel.java.troubls;


import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ramzes on 08.05.2015.
 */
public class MainTrouble {

    public static void main(String[] args) {


        Set<Car> dreams = new TreeSet<>();


        Car ivanDream = new Car("BMW");
        Car petroDream = new Car("Audi");
        Car tarasDream = new Car("Honda");
        Car someDream = new Car("Mersedes");

        dreams.add(ivanDream);
        dreams.add(petroDream);
        dreams.add(tarasDream);
        dreams.add(someDream);

        System.out.println(dreams);

        System.out.println("Petro dream present " + dreams.contains(petroDream));

        // bad way
        /*petroDream.setModel("Kalina");

        System.out.println(dreams);
        System.out.println("Petro dream present " + dreams.contains(petroDream));
        */

        //dreams.remove(petroDream);
       // petroDream.setModel("Kalina");

        //dreams.add(petroDream);
        //System.out.println(dreams);
        //System.out.println("Petro dream present " + dreams.contains(petroDream));

        // ok way
        dreams.remove(petroDream);
        petroDream =  new Car("MyCalina");
        dreams.add(petroDream);
        System.out.println(dreams);
        System.out.println("Petro dream present " + dreams.contains(petroDream));


        /// ok way











        // arrayTroubleCopy();

    }

    public static void arrayTroubleCopy() {
        int[] source = {6, 3, 3, 34, 5, 6, 6, 7, 3, 45, 34, 53};
        int[] sorted = sort(source);
        // wrong int[] copy = source;
        int[] copy = Arrays.copyOf(source, source.length);


        System.out.println("source " + Arrays.toString(source));
        System.out.println("sorted " + Arrays.toString(sorted));
        System.out.println("copy " + Arrays.toString(copy));
    }

    public static int[] sort(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        return sorted;
    }
}
