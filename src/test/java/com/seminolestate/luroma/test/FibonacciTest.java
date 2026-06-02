package com.seminolestate.luroma.test;

import static com.seminolestate.luroma.code.Fibonacci.fibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FibonacciTest {

    @ParameterizedTest
    @MethodSource("fibonacciData")
    void testFibonacci(int input, int expected) {
        long start = System.currentTimeMillis();
        int result = fibonacci(input);
        long end = System.currentTimeMillis();

        System.out.println("Running test for input: " + input);
        System.out.println("Execution time: " + (end - start) + " millis");
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + result);
        System.out.println();

        assertEquals(expected, result);
    }

    static Stream<Arguments> fibonacciData() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(5, 5),
                Arguments.of(10, 55)
        );
    }
}
