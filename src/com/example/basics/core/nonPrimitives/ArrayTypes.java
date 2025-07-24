package com.example.basics.core.nonPrimitives;

public class ArrayTypes {

    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3, 4, 5};

        short[] shortArray = {1, 2, 3, 4, 5};

        int[] intArray = {1, 2, 3, 4, 5};

        long[] longArray = {1L, 2L, 3L, 4L, 5L};

        // Double array
        double[] doubleArray = {1.1, 2.2, 3.3};

        // Character array
        char[] charArray = {'A', 'B', 'C'};

        // Boolean array
        boolean[] boolArray = {true, false, true};

        String[] names = {"Alice", "Bob", "Charlie"};

        Person[] people = {
                new Person("John", 25),
                new Person("Doe", 30)
        };

    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
