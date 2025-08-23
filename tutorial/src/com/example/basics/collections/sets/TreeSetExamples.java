package com.example.basics.collections.sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);

        System.out.println(treeSet);

        System.out.println(treeSet.first());   // Output: 10
        System.out.println(treeSet.last());    // Output: 30
        System.out.println(treeSet.contains(20)); // Output: true

        TreeSet<Integer> treeSetComparator = new TreeSet<>(Comparator.reverseOrder());
        treeSetComparator.add(10);
        treeSetComparator.add(20);
        treeSetComparator.add(30);

        System.out.println(treeSetComparator);  // Output: [30, 20, 10]

        //TreeSet<Integer> set = new TreeSet<>();
        //set.add(null);

    }
}
