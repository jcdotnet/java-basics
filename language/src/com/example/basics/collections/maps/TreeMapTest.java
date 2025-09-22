package com.example.basics.collections.maps;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 30);
        treeMap.put("Apple", 50);
        treeMap.put("Orange", 20);

        System.out.println(treeMap);

        System.out.println(treeMap.get("Banana"));   // Output: 30
        System.out.println(treeMap.firstKey());      // Output: Apple
        System.out.println(treeMap.lastKey());       // Output: Orange
        System.out.println(treeMap.remove("Banana"));
        System.out.println(treeMap.remove("Banana"));
    }
}