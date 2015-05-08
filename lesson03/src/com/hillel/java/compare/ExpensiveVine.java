package com.hillel.java.compare;

/**
 * Created by Ramzes on 06.05.2015.
 */
public class ExpensiveVine extends Vine {


    @Override
    public String taste() {
        return "Expensive";
    }

    public ExpensiveVine(int year, int price) {
        super(year, price);
    }
}
