package com.example.basics.core.operators;

public class LogicalOperators {

    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println("a && b: " + (a && b));   // false
        System.out.println("a || b: " + (a || b));  // true
        System.out.println("!a: " + (!a));          // false
        System.out.println("!b: " + (!b));

        System.out.println("!a && b: " + (!a && b));
        System.out.println("!a || b: " + (!a || b));
        System.out.println("a && !b: " + (a && !b));
        System.out.println("a || !b: " + (a || !b));
    }
}
