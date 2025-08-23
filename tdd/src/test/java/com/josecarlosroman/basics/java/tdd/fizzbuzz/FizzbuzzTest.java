package com.josecarlosroman.basics.java.tdd.fizzbuzz;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
/*public*/ class FizzbuzzTest { // no need to be public

    @Test
    @DisplayName("First number is one")
    @Order(1)
    void testFirstNumberIsOne() {
        String expected = "1";
        assertEquals(expected, Fizzbuzz.compute(1), "First number should be one");
    }

    @Test
    @DisplayName("Third number is Fizz")
    @Order(2)
    void testThirdNumberIsFizz() {
        String expected = "Fizz";
        assertEquals(expected, Fizzbuzz.compute(3), "Third number should be Fizz");
    }

    @Test
    @DisplayName("Fifth number is Buzz")
    @Order(3)
    void testFifthNumberIsBuzz() {
        String expected = "Buzz";
        assertEquals(expected, Fizzbuzz.compute(5), "Fifth number should be Buzz");
    }

    @Test
    @DisplayName("Fifteen number is Fizzbuzz")
    @Order(4)
    void testFifteenNumberIsFizzbuzz() {
        String expected = "Fizzbuzz";
        assertEquals(expected, Fizzbuzz.compute(15), "Fifteen number should be Fizzbuzz");
    }

    @Test
    @DisplayName("Fizz")
    @Order(5)
    void testForFizz() {
        String expected = "Fizz";
        assertEquals(expected, Fizzbuzz.compute(36), "Should be Fizz");
    }

    @Test
    @DisplayName("Buzz")
    @Order(6)
    void testForBuzz() {
        fail("fail");
    }

    @Test
    @DisplayName("Fizzbuzz")
    @Order(7)
    void testForFizzbuzz() {
        fail("fail");
    }

    @Test
    @DisplayName("getNumbers must return 100 numbers")
    @Order(8)
    void testGetNumbersMustReturn100Numbers() {
        fail("fail");
    }

}
