package com.example.basics.core.nonPrimitives;

public class Arrays {

    public static void main(String[] args) {
        int[] array1;  // Recommended syntax
        int array2[];  // Also valid

        int[] numbers = new int[5];  // Creates an array of size 5 (default values: 0) [0,0,0,0,0]

        int[] numbers2 = {1, 2, 3, 4, 5};  // Creates an array with these values

        int[] numbers3 = new int[]{1, 2, 3, 4, 5};

        System.out.println("First Element: " + numbers2[0]);
        System.out.println("Last Element: " + numbers2[4]);

        // iterating through arrays
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers2[i]);
        }

        for (int number : numbers2) {
            System.out.println("Element: " + number);
        }

//        int[][] matrix = new int[2][3];  // 2 rows, 3 columns
//        matrix[0][0] = 1;
//        matrix[0][1] = 2;
//        matrix[1][0] = 3;
//
//        int[][] matrix2 = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//
//        System.out.println(matrix2[0][1]);
//
//        for (int i = 0; i < matrix2.length; i++) {         // Outer loop for rows
//            for (int j = 0; j < matrix2[i].length; j++) { // Inner loop for columns
//                System.out.print("Element: " + matrix2[i][j] + " ");
//            }
//            System.out.println();
//        }

        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};
        jaggedArray[2] = new int[]{6};

        System.out.println("____________JAGGED ARRAY____________");
        for (int i = 0; i < jaggedArray.length; i++) {         // Outer loop for rows
            for (int j = 0; j < jaggedArray[i].length; j++) { // Inner loop for columns
                System.out.print("Element: " + jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
