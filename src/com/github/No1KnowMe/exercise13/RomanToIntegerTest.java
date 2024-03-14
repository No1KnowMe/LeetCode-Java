package com.github.No1KnowMe.exercise13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    @DisplayName("1st test: 'III' -> 3")
    void romanToInt_TEST_1() {
        String testInput = "III";
        int testOutput = 3;
        int actualOutput = RomanToInteger.romanToInt(testInput);

        String result = "TEST 1 FAILED";
        try{
            assertEquals(testOutput, actualOutput);
            result = "TEST 1 PASSED";
        } finally {
            System.out.println(result);
        }
    }

    @Test
    @DisplayName("2nd test: 'IV' -> 4")
    void romanToInt_TEST_2() {
        String testInput = "IV";
        int testOutput = 4;
        int actualOutput = RomanToInteger.romanToInt(testInput);

        String result = "TEST 2 FAILED";
        try{
            assertEquals(testOutput, actualOutput);
            result = "TEST 2 PASSED";
        } finally {
            System.out.println(result);
        }
    }

    @Test
    @DisplayName("3rd test: 'IX' -> 9")
    void romanToInt_TEST_3() {
        String testInput = "IX";
        int testOutput = 9;
        int actualOutput = RomanToInteger.romanToInt(testInput);

        String result = "TEST 3 FAILED";
        try{
            assertEquals(testOutput, actualOutput);
            result = "TEST 3 PASSED";
        } finally {
            System.out.println(result);
        }
    }

    @Test
    @DisplayName("4th test: 'LVIII' -> 58")
    void romanToInt_TEST_4() {
        String testInput = "LVIII";
        int testOutput = 58;
        int actualOutput = RomanToInteger.romanToInt(testInput);

        String result = "TEST 4 FAILED";
        try{
            assertEquals(testOutput, actualOutput);
            result = "TEST 4 PASSED";
        } finally {
            System.out.println(result);
        }
    }

    @Test
    @DisplayName("5th test: 'MCMXCIV' -> 1994")
    void romanToInt_TEST_5() {
        String testInput = "MCMXCIV";
        int testOutput = 1994;
        int actualOutput = RomanToInteger.romanToInt(testInput);

        String result = "TEST 5 FAILED";
        try{
            assertEquals(testOutput, actualOutput);
            result = "TEST 5 PASSED";
        } finally {
            System.out.println(result);
        }
    }
}