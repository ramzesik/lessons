package com.hillel.java.area;

/**
 * Created by Ramzes on 22.04.2015.
 */
public abstract  class Shape extends  Object  implements Colored{

    public abstract int getArea();

    @Override
    public String toString() {
        return  "Area is " + getArea() ;
    }

}
