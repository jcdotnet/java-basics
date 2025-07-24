package com.example.basics.features;

public class InstanceofPatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello, Pattern Matching!";
        if (obj instanceof String str) {
            System.out.println(str.toUpperCase());  // Output: HELLO, PATTERN MATCHING!
        }
    }

    private static void oldInstanceOf() {
        Object obj = "Hello, Pattern Matching!";
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.toUpperCase());  // Output: HELLO, PATTERN MATCHING!
        }
    }
}
