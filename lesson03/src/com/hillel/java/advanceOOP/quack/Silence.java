package com.hillel.java.advanceOOP.quack;

/**
 * Created by Ramzes on 24.04.2015.
 */
public class Silence implements QuackBehavior {
    @Override
    public String quack() {
        return "<I can't Quack>";
    }
}
