package com.example.basics.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardExample {
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.print(num);
        }
        System.out.println();
    }

    public static void printNumbersLowerBounded(List<? super Integer> list) {
        for (Object num : list) {
            System.out.print(num);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        printNumbers(intList);  // Output: 1 2 3
        printNumbers(doubleList);  // Output: 1.1 2.2 3.3

        printNumbersLowerBounded(List.of(1, 2, 3));
        printNumbersLowerBounded(List.of(1.0, 2.0, 3.0));

    }
}