package com.example.basics.generics;

import java.util.HashMap;
import java.util.Map;

public class BuiltInMap {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "apple");
        myMap.put(2, "banana");
        myMap.put(3, "orange");

        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
