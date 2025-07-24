package com.example.basics.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BuiltInList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");

        for (String s : stringList) {
            System.out.println(s);
        }

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

        Integer[] nums = {1, 2, 3, 4, 5};
        List<Integer> numList = Arrays.asList(nums);
        System.out.println(numList);

        Integer[] nums2 = {1, 2, 3, 4, 5};
        List<Integer> numList2 = new ArrayList<>(Arrays.asList(nums2));
        System.out.println(numList2);
    }
}
