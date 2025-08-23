package com.example.basics.core.loops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++; // Increment to avoid infinite loop
        }

        int j = 1;
        do {
            String a = "a";
            if (j == 3) {
                j++;
                continue;
            }
            System.out.println("Number: " + j);
            j++;
        } while (j <= 5);
    }

}
