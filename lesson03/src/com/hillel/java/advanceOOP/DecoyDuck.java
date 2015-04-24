package com.hillel.java.advanceOOP;

import com.hillel.java.advanceOOP.duck.Duck;
import com.hillel.java.advanceOOP.fly.FlyNoWay;
import com.hillel.java.advanceOOP.quack.Quack;


/**
 * Created by Ramzes on 24.04.2015.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck(){
        super(new FlyNoWay(), new Quack());
    }



    @Override
   public String display() {
        return "Decoy";
    }
}
