package com.example.basics.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModification {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Attempting to remove an element directly using a for-each loop
        for (String fruit : fruits) {
            if (fruit.equals("Apple")) {
                fruits.remove("Apple");  // This line will throw ConcurrentModificationException
            }
        }
    }
}