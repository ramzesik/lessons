package com.hillel.java.area;

import java.util.ArrayList;

/**
 * Created by Ramzes on 22.04.2015.
 */
public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Rectange rectange   = new Rectange(10,5);

        ArrayList<Colored> list = new ArrayList<>();

        Colored c = circle;

        list.add(circle);
        list.add(rectange);


        //polymorphism();

    }

    public static void polymorphism() {
        Circle circle = new Circle(10);
        Rectange rectange   = new Rectange(10,5);

        ArrayList<Shape> list = new ArrayList<>();

        list.add(circle);
        list.add(rectange);

        print(list);
    }

    private static void printArea(ArrayList<Shape> list) {
        for (Shape shape: list) {
            System.out.println("area is " + shape.getArea());
        }
    }

    private static void print(ArrayList<Shape> list) {
        for (Shape shape: list) {
            System.out.println( shape.toString());
        }
    }

}
