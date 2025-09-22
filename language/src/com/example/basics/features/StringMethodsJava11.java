package com.example.basics.features;

public class StringMethodsJava11 {
    public static void main(String[] args) {
        String str = "  Hello World  ";

        System.out.println(str.isBlank());    // false
        System.out.println("  ".isBlank());  // true

        System.out.println(str.strip());     // "Hello World"
        System.out.println(str.stripLeading());  // "Hello World  "
        System.out.println(str.stripTrailing()); // "  Hello World"

        String multiLine = "Line1\nLine2\nLine3";
        multiLine.lines().forEach(System.out::println);

        System.out.println("Hi".repeat(3));  // "HiHiHi"
    }
}
