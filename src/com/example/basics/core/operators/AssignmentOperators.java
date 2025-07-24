package com.example.basics.core.operators;

public class AssignmentOperators {

    public static void main(String[] args) {
        int a = 10;

        System.out.println("Initial value of a: " + a);

        a += 5; // a = a + 5
        System.out.println("a += 5: " + a);

        a -= 3; // a = a - 3
        System.out.println("a -= 3: " + a);

        a *= 2; // a = a * 2
        System.out.println("a *= 2: " + a);

        a /= 2; // a = a / 2
        System.out.println("a /= 2: " + a);

        a %= 3; // a = a % 3
        System.out.println("a %= 3: " + a);
    }
}
