package com.josecarlosroman.basics.java.features.java9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        // https://docs.oracle.com/javase/9/docs/api/java/util/stream/Stream.html
        // takeWhile
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> takeWhileStream = numbers.stream()
                .takeWhile(n -> n < 5);
        takeWhileStream.forEach(System.out::println); // 1 2 3 4

        // filter()
        Stream<Integer> filterStream = numbers.stream()
                .filter(n -> n < 5);
        filterStream.forEach(System.out::println); // 1 2 3 4

        // dropWhile
        numbers.stream().dropWhile(n -> n < 5)
                .forEach(System.out::println); // Output: 5 6 7 8 9

        // enhanced iterate method
        Stream.iterate(0, i -> i < 10, i -> i + 1)
                .forEach(System.out::println); // 0 1 2 3 4 5 6 7 8 9

        // ofNullable for optional elements
        String hello = "Hello World";
        Stream.ofNullable(hello)
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println); // Hello World

        List<String> list= Arrays.asList("hello", "beautiful", "world", null, "I", "am", "here");
        list.forEach(System.out::println); // hello beautiful world null I am here

        list.stream().takeWhile((s)->s.length()>4).forEach(System.out::println);

        Stream<List<String>> stream = Stream.ofNullable(list);
        stream.forEach(System.out::println); // [hello, beautiful, world, I, am, here]
    }
}
