package com.example.basics.collections.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> iterator = list.iterator();

        System.out.println("Iterating over the list:");

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            // Removing "Banana" while iterating
            if (element.equals("Banana")) {
                iterator.remove();  // Removes "Banana" from the list
            }
        }

        System.out.println("\nList after iteration and removal:");
        System.out.println(list);  // Output: [Apple, Cherry]

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            if (fruit.equals("banana")) {
                iterator.remove();
            }
        }
        System.out.println(fruits);


    }
}