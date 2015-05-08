package com.hillel.java.compare;

import java.util.*;

/**
 * Created by Ramzes on 29.04.2015.
 */
public class Sommelier {

    public static void main(String[] args) {


        // List and Set is Collection, Collection Implement Iterable

        List<Vine> store = new ArrayList<>();

            store.add(new Vine(1999, 200));
            store.add(new Vine(1995, 250));

            store.add(new ExpensiveVine(1995, 2500));

            store.add(new CheapVine(2012, 50));
            store.add(new CheapVine(2012, 50));

        print(store);


        Set<Vine> menu = new TreeSet<>();

        menu.addAll(store);
        System.out.println("menu:");
        print(menu);


        Set<Vine> orderedByPrice  = new TreeSet<>(new OrderByPriceYear());
        orderedByPrice.addAll(store);

        System.out.println("Menu order comparator:");
        print(orderedByPrice);

        //printTaste(list);
    }



    public static void print(Iterable<Vine> arrayVines) {
        for(Vine vine: arrayVines) {
            System.out.println(vine);
        }
    }


    public static void printTaste(List<Vine> arrayVines) {

        // list have iterator method
       Iterator<Vine> iterator =  arrayVines.iterator();

        while (iterator.hasNext()) {
            Vine vine = iterator.next();
            System.out.println(vine.taste());
        }

        for(Vine vine: arrayVines) {
            System.out.println(vine.taste());
        }

    }

   public static void somemedhod() {
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
       // for list only
        Collections.sort(list);

        System.out.println(list);


        Comparator<Vine> orderByPrice = new OrderByPriceYear();

        Collections.sort(list,orderByPrice);
        System.out.println(list);
    }
}


