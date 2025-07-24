package com.example.basics.generics;

public class Utility {

    // Generic method with a type parameter T
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D"};

        // Call the generic method with different types
        printArray(intArray);  // Output: 1 2 3 4 5
        printArray(strArray);  // Output: A B C D
    }
}