package com.hillel.java.advanceOOP.duck;

import com.hillel.java.advanceOOP.fly.Fly;
import com.hillel.java.advanceOOP.fly.FlyBehevior;
import com.hillel.java.advanceOOP.quack.Quack;
import com.hillel.java.advanceOOP.quack.QuackBehavior;

/**
 * Created by Ramzes on 24.04.2015.
 */
public class RedHeadDuck extends Duck  {

            public RedHeadDuck() {
                super(new Fly(), new Quack());
            }

    @Override
    public String display() {
        return "RefHEadDuck";
    }
}
