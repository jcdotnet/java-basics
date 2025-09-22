package com.example.basics.features;

import java.util.Optional;

public class OptionalExample{

    static String getName() {
        return null;
    }

    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(getName());
        if (name.isEmpty()) {
            System.out.println("No value found");
        }
        System.out.println(name.orElse("Default Name"));
        System.out.println(name.orElseGet(() -> {
            System.out.println("Or else get");
            return "Default name";
        }));
        //System.out.println(name.get());

        Optional<String> namePresent = Optional.ofNullable("some name");
        namePresent.ifPresent(value -> {
            System.out.println(value);
        });

        System.out.println(namePresent.orElse("Default"));
    }
}