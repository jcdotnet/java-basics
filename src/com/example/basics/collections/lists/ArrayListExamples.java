package com.example.basics.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        System.out.println(arrayList);

        arrayList.add(1, "C#");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.remove("C++"));
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("Python"));
        System.out.println(arrayList.contains("Python"));
        System.out.println(arrayList.size());

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);

        numbers.set(1, 4);
        System.out.println(numbers);

        int secondNumber = numbers.get(1);
        System.out.println(secondNumber);

        List<String> myArrayList = new ArrayList<>();

        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Cherry");
        System.out.println("Source list: " + myArrayList);

        myArrayList.add(1, "Blueberry");
        System.out.println("List with 'Blueberry': " + myArrayList);

        myArrayList.remove(1);
        System.out.println("List without 2nd element: " + myArrayList);

        myArrayList.remove("Banana");
        System.out.println("List without 'Banana': " + myArrayList);

        String secondElement = myArrayList.get(1);
        System.out.println("Second element: " + secondElement);

        int indexOfCherry = myArrayList.indexOf("Cherry");
        System.out.println("Index of 'Cherry': " + indexOfCherry);

        boolean containsCherry = myArrayList.contains("Cherry");
        System.out.println("Flag that determines if 'Cherry' exists: " + containsCherry);
    }
}