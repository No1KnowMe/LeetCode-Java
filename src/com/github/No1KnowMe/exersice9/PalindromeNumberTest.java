package com.github.No1KnowMe.exersice9;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @DisplayName("Check a number if it's a palindrome.")
    @ParameterizedTest(name = "Is it {0} a palindrome? {1}")
    @CsvSource({
            "121, true",
            "-121, false",
            "10, false"
    })
    void checkPalindrome(int number, boolean result) {
        assertEquals(result, PalindromeNumber.checkPalindrome(number),
                () -> "Is it " + number + " a palindrome? " + result);
    }
}