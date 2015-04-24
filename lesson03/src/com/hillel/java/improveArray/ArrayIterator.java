package com.hillel.java.improveArray;

import java.util.Iterator;

/**
 * Created by Ramzes on 24.04.2015.
 */
public class ArrayIterator implements Iterator {

    private StringArray stringArray;
    //alredy 0
    private int nextIndex;


    public ArrayIterator(StringArray stringArray) {
        this.stringArray = stringArray;
    }
    @Override
    public boolean hasNext() {

        return nextIndex < stringArray.size();
    }

    @Override
    public Object next() {
        Object next = stringArray.get(nextIndex);
        nextIndex++;
        return next;
    }
}
