package com.example.basics.core.nonPrimitives;

import java.util.Arrays;

public class ArraysClass {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(numbers));

        // Sort and print array
        int[] unsorted = {5, 2, 8, 3};
        Arrays.sort(unsorted);
        System.out.println("Sorted Array: " + Arrays.toString(unsorted));

        int index = Arrays.binarySearch(numbers, 30);  // Output: 2
        System.out.println("Binary search of 30: " + index);

        int[] nums = new int[5];
        Arrays.fill(nums, 7);  // Fills all elements with 7
        System.out.println(Arrays.toString(nums));  // Output: [7, 7, 7, 7, 7]

        int[] a = {1, 2, 4};
        int[] b = {1, 2, 3};
        System.out.println("Arrays are equal: " + Arrays.equals(a, b));
    }
}
