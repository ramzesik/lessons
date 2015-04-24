package com.hillel.java.composites;

import org.omg.CORBA.StringHolder;

/**
 * Created by Ramzes on 24.04.2015.
 */
public class Employee implements Nameble{
    String departamen;
    Person person = new Person();


    public  String getNmame(){
        return person.name;

    }

    @Override
    public String getName() {
        return null;
    }
}
