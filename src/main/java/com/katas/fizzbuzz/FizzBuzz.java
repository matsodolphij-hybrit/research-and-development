package com.katas.fizzbuzz;

import java.util.function.Predicate;
import java.util.stream.IntStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FizzBuzz {

    // A predicate is a statement or mathematical assertion that contains variables, sometimes referred to as predicate variables,
    // and may be true or false depending on those variables' value or values.
    final private Predicate<Integer> isDivisibleByThree = value -> value % 3 == 0;
    final private Predicate<Integer> isDivisibleByFive = value -> value % 5 == 0;
    final private Predicate<Integer> isOrContainsThree = value -> value.toString().contains("3") || value == 3;
    final private Predicate<Integer> isOrContainsFive = value -> value.toString().contains("5") || value == 5;
    final private Predicate<Integer> isFizzBuzz = isDivisibleByThree.and(isDivisibleByFive).or(isOrContainsThree.and(isOrContainsFive));
    final private Predicate<Integer> isFizz = isDivisibleByThree.or(isOrContainsThree);
    final private Predicate<Integer> isBuzz = isDivisibleByFive.or(isOrContainsFive);

    public FizzBuzz() {
        printFizzBuzzList();
    }

    /**
     *
     * Write a program that prints the numbers from 1 to 100.
     * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
     * For numbers which are multiples of both three and five print “FizzBuzz “.
     * -
     * Stage 2 - new requirements
     * A number is fizz if it is divisible by 3 or if it has a 3 in it
     * A number is buzz if it is divisible by 5 or if it has a 5 in it
     */
    public void printFizzBuzzList() {
        for (final int num : IntStream.rangeClosed(1, 100).boxed().toList()) {
            log.atInfo().log(defineValue(num));
        }
    }

    public String defineValue(final int value) {
        if (isFizzBuzz.test(value)) {
            return "fizzbuzz";
        } else if (isFizz.test(value)) {
            return "fizz";
        } else if (isBuzz.test(value)) {
            return "buzz";
        } else {
            return String.valueOf(value);
        }
    }
}
