package com.hillel.java.inheritans;

import com.hillel.java.improveArray.StringArray;

import java.util.Objects;

/**
 * Created by Ramzes on 22.04.2015.
 */
public class Person extends Object implements Comparable<Person> {


    private String name;
    public String field = "Person's field";

// default constructor
    public Person() {
        // ����� ������ java ��������� ��� ����� ������, ����� ������������ �������
        super();
        System.out.println("Creating Persone");
    }


    public Person(String name) {
        this.name = name;
    }


    public void setName(String name) {

        this.name = name;
    }

    public String someMethod() {
        return "Person's method. Method see: {field: " + field + ", static method: " + staticMethod() + "}";
    }
    public static String staticMethod() {
        return "Person's static method";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
