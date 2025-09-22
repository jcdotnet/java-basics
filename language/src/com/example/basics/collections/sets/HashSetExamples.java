package com.example.basics.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Source Set: " + set);

        set.add(2); // This will be ignored and not added to the set
        System.out.println("Set after adding '2': " + set);

        boolean containsTwo = set.contains(2); // This will return true
        System.out.println("'containsTwo' flag: " + containsTwo);

        set.remove(2); // This will remove 2 from the set
        System.out.println("Set after removing '2': " + set);

        // Adding elements to a set
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Checking if a set contains a particular element
        System.out.println(numbers.contains(1)); // Output: true
        System.out.println(numbers.contains(4)); // Output: false

        // Removing an element from a set
        numbers.remove(2);
        System.out.println(numbers.contains(2)); // Output: false

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(3);
        setB.add(4);

        setA.addAll(setB);
        System.out.println("Union of two sets: " + setA);

        //setA.retainAll(setB); // intersection
        //System.out.println(setA);

    }
}
