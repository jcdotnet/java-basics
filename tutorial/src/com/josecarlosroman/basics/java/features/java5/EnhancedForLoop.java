package com.josecarlosroman.basics.java.features.java5;

import java.util.Arrays;
import java.util.List;

public class EnhancedForLoop {
    public static void main(String[] args) {
        // designed for iteration through Collections and arrays
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }
        List<String> students = Arrays.asList("John", "Jane", "Alice", "David");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        // enhanced for loop (AKA foreach loop)
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int number: numbers) System.out.println("Count is: " + number);

        for (String student : students) {
            System.out.println(student);
        }
    }
}
