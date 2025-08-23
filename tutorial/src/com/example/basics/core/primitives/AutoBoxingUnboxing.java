package com.example.basics.core.primitives;

public class AutoBoxingUnboxing {

    public static void main(String[] args) {
        // Example of primitive type vs Object
        int a = 5;                // Primitive type
        Integer b = new Integer(5); // Object (Wrapper class)
        String str = "Hello";      // Object (String class)

        // Autoboxing: primitive to wrapper
        int num = 5;
        Integer boxedNum = num;  // int to Integer

        // Unboxing: wrapper to primitive
        Integer objNum = 10;
        int unboxedNum = objNum;  // Integer to int

        // Output
        System.out.println("Boxed: " + boxedNum);     // Output: 5
        System.out.println("Unboxed: " + unboxedNum); // Output: 10

        // Primitives can't have null values
        // int primitiveNull = null;  // This would give a compilation error

        // Wrappers can have null values
        Integer wrapperNull = null;
        int primitiveNull = wrapperNull;


    }
}
