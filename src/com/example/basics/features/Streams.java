package com.example.basics.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        withoutStream();
        functional();
    }

    public static void withoutStream() {
        List<String> names = Arrays.asList("Anna", "John", "Mike");
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                filteredNames.add(name.toUpperCase());
            }
        }
        System.out.println(filteredNames);
    }

    public static void functional() {
        List<String> names = Arrays.asList("Anna", "John", "Mike");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}