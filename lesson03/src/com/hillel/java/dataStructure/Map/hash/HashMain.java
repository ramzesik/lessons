package com.hillel.java.dataStructure.Map.hash;

/**
 * Created by Ramzes on 13.05.2015.
 */
public class HashMain {
    public static void main(String[] args) {

        Movie movie1 = new Movie(2000,"Men in black",33333L);
        Movie movie2 = new Movie(2000,"Die hard",1000L);


        System.out.println(movie1.hashCode());
        System.out.println(movie2.hashCode());

        MyHashSet myHashSet = new MyHashSet();


        myHashSet.add(movie1);
        myHashSet.add(movie2);

        System.out.println("movie is in " + myHashSet.containts(movie1));
        System.out.println("movie is in " + myHashSet.containts(movie2));


        System.out.println(myHashSet);

    }
}
