package com.example.basics.features;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodsJava9 {

    public static void main(String[] args) {
        var names = List.of("Alice", "Bob", "Charlie");
        System.out.println(names);
        //names.add("");

        var set = Set.of("Red", "Green", "Blue");
        //set.add("");
        System.out.println(set);

        var map = Map.of(
            "Alice", 25,
            "Bob", 30,
            "Charlie", 35
        );
        // map.put("a", 1);
        System.out.println(map);
    }
}