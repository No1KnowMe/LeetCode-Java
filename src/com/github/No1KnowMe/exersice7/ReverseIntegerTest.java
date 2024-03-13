package com.github.No1KnowMe.exersice7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverse_EXAMPLE_1() {
        int testInput = 123;
        int testOutput = 321;
        int actualOutput = ReverseInteger.reverse(testInput);

        assertEquals(testOutput, actualOutput);
        String result = (testOutput == actualOutput) ? "TEST 1 PASSED" : "TEST 1 FAILED";
        System.out.println(result);
    }

    @Test
    void reverse_EXAMPLE_2() {
        int testInput = -123;
        int testOutput = -321;
        int actualOutput = ReverseInteger.reverse(testInput);

        assertEquals(testOutput, actualOutput);
        String result = (testOutput == actualOutput) ? "TEST 2 PASSED" : "TEST 2 FAILED";
        System.out.println(result);
    }

    @Test
    void reverse_EXAMPLE_3() {
        int testInput = 120;
        int testOutput = 21;
        int actualOutput = ReverseInteger.reverse(testInput);

        assertEquals(testOutput, actualOutput);
        String result = (testOutput == actualOutput) ? "TEST 3 PASSED" : "TEST 3 FAILED";
        System.out.println(result);
    }

    @Test
    void reverse_EXAMPLE_4() {
        int testInput = 1000000003;
        int testOutput = 0;
        int actualOutput = ReverseInteger.reverse(testInput);

        assertEquals(testOutput, actualOutput);
        String result = (testOutput == actualOutput) ? "TEST 4 PASSED" : "TEST 4 FAILED";
        System.out.println(result);
    }
}