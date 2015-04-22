package com.hillel.java.inheritans;

import com.hillel.java.improveArray.StringArray;

/**
 * Created by Ramzes on 22.04.2015.
 */
public class Person {


    private String name;
// default constructor
    public Person() {
        // метод коорый java выполянет при ините класса, вызов конструктора парента
        super();
        System.out.println("Creating Persone");
    }

    public Person(String name) {
        this.name = name;
    }


    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

}
