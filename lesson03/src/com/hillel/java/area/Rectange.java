package com.hillel.java.area;

/**
 * Created by Ramzes on 22.04.2015.
 */
public class Rectange extends Shape{


    private int a;
    private int b;


    // contructor

    public Rectange(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // override наследуем с абстракта
    @Override // annotaion анатация
    public int getArea() {
        return a*b;
    }

    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public String toString() {
        return "Rectagnle, " + a + "*" + b +  super.toString();

    }
}
