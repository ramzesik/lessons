package com.hillel.java.advanceOOP;

import com.hillel.java.advanceOOP.duck.Duck;
import com.hillel.java.advanceOOP.duck.MallardDuck;
import com.hillel.java.advanceOOP.duck.RedHeadDuck;

/**
 * Created by Ramzes on 24.04.2015.
 */
public class Main {

    public static void main(String[] args) {


        // MallardDuck mallardDuck = new MallardDuck();
        // RedHeadDuck redHeadDuck = new RedHeadDuck();

        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RedHeadDuck();
        Duck decoy       = new DecoyDuck();



        test(mallardDuck);
        test(redHeadDuck);
        test(rubberDuck);
        test(decoy);
    }


    public static void test(Duck duck) {
        System.out.println(duck.display());
        System.out.println(duck.fly());
        System.out.println(duck.swin());
        System.out.println(duck.quack());
        System.out.println("-------------");
    }

}
