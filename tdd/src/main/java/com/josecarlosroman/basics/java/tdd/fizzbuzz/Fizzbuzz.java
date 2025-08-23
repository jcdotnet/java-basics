package com.josecarlosroman.basics.java.tdd.fizzbuzz;

public class Fizzbuzz {

    private static final int numbers = 100;

    public static int getNumbers() {
        return numbers;
    }

    public static String compute(int number) {

        if (number % 3 == 0 && number % 5 == 0)
            return "Fizzbuzz";
        else if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";
        else return Integer.toString(number);
    }
}
