package com.example.basics.core.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Pre-increment: " + (++a)); // 11
        System.out.println("Post-increment: " + (a++)); // 11, then a = 12
        System.out.println("Post-increment result: " + (a)); // 12
        System.out.println("Negative value " + -a);

        int b = 15;
        System.out.println("Pre-decrement: "+ (--b));
        System.out.println("Post-decrement: "+ (b--));
        System.out.println("Post-decrement result: "+ b);
    }
}
