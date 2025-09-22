package com.josecarlosroman.basics.java.features.java8;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
        List<String> students = Arrays.asList("John", "Jane", "Alice", "David");
        // Collection: enhanced for loop
        for (String student : students) {
            System.out.println(student);
        }
        // Collection: stream
        students.forEach(System.out::println);
        students.stream()
                .filter(s -> s.startsWith("J"))
                .forEach(System.out::println);
    }
}
