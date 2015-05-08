package com.hillel.java.compare;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Ramzes on 29.04.2015.
 */
public class OrderByPriceYear implements Comparator<Vine>{
   
    @Override
    public int compare(Vine one,Vine other) {
        int result =one.getPrice() - other.getPrice();
        if (result == 0) {
            result = one.getYear() - other.getYear();
        }



        return result;


    }
}
