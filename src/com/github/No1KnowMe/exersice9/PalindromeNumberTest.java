package com.github.No1KnowMe.exersice9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void checkPalindrome_TEST_1() {
        boolean testOutput = true;
        int testInput = 121;
        boolean actualOutput = PalindromeNumber.checkPalindrome(testInput);

        assertEquals(testOutput, actualOutput);
        String result = (testOutput == actualOutput) ? "TEST 1 PASSED" : "TEST 1 FAILED";
        System.out.println(result);
    }

    @Test
    void checkPalindrome_TEST_2() {
        boolean testOutput = false;
        int testInput = -121;
        boolean actualOutput = PalindromeNumber.checkPalindrome(testInput);

        assertEquals(testOutput, actualOutput);
        String result = (testOutput == actualOutput) ? "TEST 2 PASSED" : "TEST 2 FAILED";
        System.out.println(result);
    }

    @Test
    void checkPalindrome_TEST_3() {
        boolean testOutput = false;
        int testInput = 10;
        boolean actualOutput = PalindromeNumber.checkPalindrome(testInput);

        assertEquals(testOutput, actualOutput);
        String result = (testOutput == actualOutput) ? "TEST 3 PASSED" : "TEST 3 FAILED";
        System.out.println(result);
    }
}