package com.hillel.java.advanceOOP.duck;

import com.hillel.java.advanceOOP.fly.FlyBehevior;
import com.hillel.java.advanceOOP.quack.QuackBehavior;

/**
 * Created by Ramzes on 24.04.2015.
 */
public abstract class Duck {

    private FlyBehevior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehevior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    public String fly() {
        return flyBehavior.fly();
    }

    public String quack() {
        return quackBehavior.quack();
    }


    public String swin() {
        return "I'm swimming";
    }

   public abstract String display();
}
