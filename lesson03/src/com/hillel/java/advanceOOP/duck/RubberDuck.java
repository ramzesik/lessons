package com.hillel.java.advanceOOP.duck;


import com.hillel.java.advanceOOP.fly.FlyNoWay;
import com.hillel.java.advanceOOP.quack.Silence;

/**
 * Created by Ramzes on 24.04.2015.
 */
public class RubberDuck extends Duck {


    public RubberDuck() {
        super(new FlyNoWay(), new Silence());
    }

    @Override
    public String display() {
        return "RubberDuck";
    }
}
