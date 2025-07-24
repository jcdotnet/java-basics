package com.example.basics.features;

import java.util.Optional;

public class OptionalJava11 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java 11");

        System.out.println(optional.isEmpty());  // false

        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.orElseThrow(() -> new IllegalArgumentException("Value is missing"));
    }
}
