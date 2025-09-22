package com.josecarlosroman.basics.java.features.java8;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        // created to avoid NPE in runtime
        // https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
        Optional<String> optionalName = Optional.of("John Doe");
        if (optionalName.isPresent()) {
            System.out.println("Optional: " + optionalName);
            System.out.println("Name: " + optionalName.get());
        } else {
            System.out.println("No name found.");
        }
        // ofNullable // if the value is null then the Optional will be empty
        String student = null;
        Optional<String> optionalStudent1 = Optional.ofNullable(student);
        System.out.println(optionalStudent1); // Optional.empty
        System.out.println(optionalStudent1.orElse("Unnamed Student"));

        String[] students = new String[5];
        Optional<String> optionalStudent2 = Optional.ofNullable(students[3]);
        if (optionalStudent2.isPresent()) {
            System.out.print(optionalStudent2.get());
        } else {
            System.out.println("No name found.");
        }

    }
}
