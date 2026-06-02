package com.seminolestate.luroma.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.seminolestate.luroma.code.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void testFibonacciZero() {
        Assertions.assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void testFibonacciOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void testFibonacciTwo() {
        assertEquals(1, Fibonacci.fibonacci(2));
    }

    @Test
    void testFibonacciThree() {
        assertEquals(2, Fibonacci.fibonacci(3));
    }

    @Test
    void testFibonacciFive() {
        assertEquals(5, Fibonacci.fibonacci(5));
    }

    @Test
    void testFibonacciTen() {
        assertEquals(55, Fibonacci.fibonacci(10));
    }
}
