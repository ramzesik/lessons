package com.hillel.java.compare;

import com.hillel.java.improveArray.ArrayIterator;

import javax.swing.text.View;
import java.util.*;

/**
 * Created by Ramzes on 29.04.2015.
 */
public class Sommelier {

    public static void main(String[] args) {

        Vine bottle1 = new Vine(1995,200);
        Vine bottle2 = new Vine(1995,100);

        System.out.println("they are equal " + bottle1.equals(bottle2));
        System.out.println("1 greater than 2 " + (bottle1.compareTo(bottle2) > 0));


        //ArrayList<Vine> list = new ArrayList<>();
        // add to list only obj vine
        List<Vine> list = new ArrayList<>();


        list.add(bottle1);
        list.add(bottle2);
        list.add(bottle1);

        System.out.println(list);
        // work with interface Comparable
        // use compareTo
        //Comparable vine = (Comparable) bottle2;  сортировшик прикатсовывает к интерфейсу Comparable
        Collections.sort(list);

        System.out.println(list);


        Comparator<Vine> orderByPrice = new VineComparator();

        Collections.sort(list,orderByPrice);
        System.out.println(list);

    }
}


