package com.example.basics.collections.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the set
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple");  // Duplicate, will not be added
        linkedHashSet.add("Date");
        linkedHashSet.add(null);

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
