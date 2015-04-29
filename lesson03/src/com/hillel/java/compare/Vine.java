package com.hillel.java.compare;

import javax.swing.text.View;

/**
 * Created by Ramzes on 29.04.2015.
 */
public class Vine implements  Comparable<Vine> {
    private  int year;
    private  int price;


    public Vine(int year,int price) {
        this.year=year;
        this.price = price;
    }



    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  Vine)) {
            return  false;
        }
        // если передали тот же объект
        // контракт метода
        if (super.equals(obj)) {
            return true;
        }
//        if (((Vine) obj).year == this.year) {
//
//        }

        // можем обратиться к приватной только есил мы ее вызвали из самого класса
        Vine other = (Vine) obj;
        return  other.year==this.year;
        
    }
    @Override
    public int compareTo(Vine bottle2) {

        return this.year - bottle2.year;

    }

    @Override
    public String toString() {
        return "Vine year " + year + " price:" + price;
    }

    public int getPrice() {
        return price;
    }
}
