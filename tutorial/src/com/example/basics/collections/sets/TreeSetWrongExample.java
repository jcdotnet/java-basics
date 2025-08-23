package com.example.basics.collections.sets;

import java.util.TreeSet;

public class TreeSetWrongExample {

    public static void main(String[] args) {
        TreeSet<Number> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2.0);
        treeSet.add(3f);

        System.out.println(treeSet);

//        TreeSet<Number> treeSetFixed = new TreeSet<>();
//        treeSetFixed.add(1f);
//        treeSetFixed.add(2f);
//        treeSetFixed.add(3f);
//
//        System.out.println(treeSetFixed);  // Output: [1.0, 2.0, 3.0]

    }
}
