package com.example.basics.core.variables;

public class Scopes {
    public static int a = 2; // a has global scope

    public static void main(String[] args) {
        int x = 5; // x has local scope within main

        if (x == 5) { // block starts here
            int y = 10; // y has block scope within if statement
            System.out.println(y); // y can be accessed here
        } // block ends here

        System.out.println(a); // a can be accessed here
        System.out.println(x); // x can still be accessed here
        // System.out.println(y); // y cannot be accessed here
    }

    public static void someMethod() {
        System.out.println(a); // a can also be accessed here
    }
}
