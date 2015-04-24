package com.hillel.java.lists;

import com.hillel.java.improveArray.StringArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Ramzes on 24.04.2015.
 */
public class ListMain {

    public static void main(String[] args) {
        List list = new ArrayList();
        List linkedList = new LinkedList();


        StringArray array = new StringArray();

        array.add("123");
        array.add("sdf");
        array.add("qwe");

        for (Object o: array) {
            System.out.println(o);
        }



        list.add("123");
        list.add("sdf");
        list.add("qwe");


        for (Object o: list) {
            System.out.println(o);
        }
    }
}
