package com.hillel.java.dataStructure.Map.Mapp;

import com.hillel.java.inheritans.Person;

import java.util.*;

/**
 * Created by Ramzes on 08.05.2015.
 */
public class MapMain {
    public static void main(String[] args) {

        Person petro = new Person("Petro");
        Person taras = new Person("Taras");
        Person ivan  = new Person("Ivan");


        Map<Person, String> studentToReason = new TreeMap<>();

        studentToReason.put(petro, "To bacome a programmer");
        studentToReason.put(taras, "Bacome a programmer1");
        studentToReason.put(ivan, "have a lot of fre time");


        System.out.println("Petro's reason is:" + studentToReason.get(petro));
        System.out.println("Petro's reason is:" + studentToReason.get(ivan));

        System.out.println(studentToReason.toString());


    }
}
