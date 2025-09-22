package com.example.basics.collections.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Getting a ListIterator starting at the beginning of the list
        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Forward Traversal:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);

            // Modify element conditionally
            if (fruit.equals("Banana")) {
                listIterator.set("Blueberry");  // Changes "Banana" to "Blueberry"
            }
        }

        System.out.println("\nList after modification:");
        System.out.println(list);

        System.out.println("\nBackward Traversal:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);

            // Adding element before "Apple"
            if (fruit.equals("Apple")) {
                listIterator.add("Avocado");  // Adds "Avocado" before "Apple"
            }
        }

        System.out.println("\nList after adding elements:");
        System.out.println(list);

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        ListIterator<String> iterator = fruits.listIterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("banana")) {
                iterator.remove();
                iterator.add("grapefruit");
            }
        }
        System.out.println(fruits);
    }
}