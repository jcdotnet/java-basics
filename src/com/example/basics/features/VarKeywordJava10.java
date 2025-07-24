package com.example.basics.features;

import java.util.List;

public class VarKeywordJava10 {

    public static void main(String[] args) {

        // The type is inferred as String
        var message = "Hello, Java 11!";
        System.out.println(message);  // Output: Hello, Java 11!

        // Inferred as List<String>
        var names = List.of("Alice", "Bob", "Charlie");
        System.out.println(names);

        // Inferred as int
        var number = 42;
        System.out.println(number);

        // Using var in a loop
        for (var name : names) {
            System.out.println(name);
        }

    }
}
