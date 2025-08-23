package com.josecarlosroman.basics.java.tdd.fizzbuzz;

public class Fizzbuzz {

    public static String compute(int number) {

        if (number % 3 == 0)
            return "Fizz";
        else return Integer.toString(number);
    }
}
