package com.example.basics.generics;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {

        //ArrayList numbers = new ArrayList();
        //numbers.add(1);
        //numbers.add(2);
        //numbers.add("three"); // adding a string to the collection

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(1);
        numbers2.add(2);
        // numbers2.add("three"); // compile-time error

        // Create an ArrayList of String
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        for (String s : list) {
            System.out.println(s);
        }
    }
}