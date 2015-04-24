package com.hillel.java.advanceOOP.fly;

/**
 * Created by Ramzes on 24.04.2015.
 */
public class FlyNoWay implements  FlyBehevior{
    @Override
    public String fly() {
        return "can't fly";
    }
}
