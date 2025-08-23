package com.josecarlosroman.basics.java.tdd.fizzbuzz;

import org.apache.commons.lang3.StringUtils;

public class Fizzbuzz {

    private static final int numbers = 100;

    public static int getNumbers() {
        return numbers;
    }

    public static String compute(int number) {

        StringBuilder result = new StringBuilder();

        if (number % 3 == 0)
            result.append("fizz");
        if (number % 5 == 0)
            result.append("buzz");

        if (result.isEmpty())
            result.append(number);

        return StringUtils.capitalize(result.toString()); // result must be Fizzbuzz, not FizzBuzz
    }
}
