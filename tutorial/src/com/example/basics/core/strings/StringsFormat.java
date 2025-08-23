package com.example.basics.core.strings;

public class StringsFormat {
    public static void main(String[] args) {
        String name = "John Doe";
        int age = 36;
        String result = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(result);
        System.out.println(String.format("My name is %10s and I am %3d years old.", name, age));

        float price = 12.5f;
        System.out.println(String.format("The price is $%.2f.", price));



    }
}
