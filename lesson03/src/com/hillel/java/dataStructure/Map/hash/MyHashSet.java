package com.hillel.java.dataStructure.Map.hash;

import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by Ramzes on 13.05.2015.
 */
public class MyHashSet {

    private int capasity = 3;
    private LinkedList<Object>[] array = new LinkedList[capasity];

    public MyHashSet() {
        for (int i=0;i< array.length; i++) {
            array[i]=new LinkedList<>();
        }
    }

    public void add(Object o) {
        int index = getIndex(o);
        LinkedList<Object> list = array[index];
        list.add(o);

    }

    public int getIndex(Object o) {
        return Math.abs(o.hashCode() % array.length);
    }


    public boolean containts(Object o) {
        int index = getIndex(o);

        LinkedList<Object> list = array[index];
        // contains used equals in Movie
        return list.contains(o);

    }


    @Override
    public String toString() {
        return "MyHashSet{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
