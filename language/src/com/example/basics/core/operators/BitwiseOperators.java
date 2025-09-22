package com.example.basics.core.operators;

public class BitwiseOperators {

    public static void main(String[] args) {
        int a = 5, b = 3; // Binary: 5 = 0101, 3 = 0011
        System.out.println("a & b: " + (a & b));   // 1 (0001)
        System.out.println("a | b: " + (a | b));   // 7 (0111)
        System.out.println("a << 1: " + (a << 1)); // 10 (1010)
        System.out.println("a >> 1: " + (a >> 1)); // 2 (0010)
        System.out.println("~a:  " + (~a));
        System.out.println("a^b:  " + (a^b));
    }
}
