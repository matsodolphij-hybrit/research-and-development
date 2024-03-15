package com.research.katas.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void testMethodOutputIsString() {
        assertEquals("2", fizzBuzz.defineValue(2));
    }

    @Test
    void threeShouldReturnFizz() {
        assertEquals("fizz", fizzBuzz.defineValue(3));
    }

    @Test
    void fiveShouldReturnBuzz() {
        assertEquals("buzz", fizzBuzz.defineValue(5));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99})
    void divisibleByThreeShouldReturnFizz(Integer val) {
        assertEquals("fizz", fizzBuzz.defineValue(val));

    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 40, 50, 55, 65, 70, 80, 85, 95, 100})
    void divisibleByFiveShouldReturnBuzz(Integer val) {
        assertEquals("buzz", fizzBuzz.defineValue(val));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90})
    void divisibleByThreeAndFiveShouldReturnFizzBuzz(Integer val) {
        assertEquals("fizzbuzz", fizzBuzz.defineValue(val));
    }

    @ParameterizedTest
    @ValueSource(ints = {53, 35})
    void containsBothThreeAndFiveShouldReturnFizzBuzz(Integer val) {
        assertEquals("fizzbuzz", fizzBuzz.defineValue(val));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 13, 23, 31, 32, 33, 34, 36, 37, 38, 39, 43, 63, 73, 83, 93})
    void containsThreeShouldReturnFizz(Integer val) {
        assertEquals("fizz", fizzBuzz.defineValue(val));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 25, 55, 65, 85, 95})
    void containsFiveShouldReturnBuzz(Integer val) {
        assertEquals("buzz", fizzBuzz.defineValue(val));
    }

}
