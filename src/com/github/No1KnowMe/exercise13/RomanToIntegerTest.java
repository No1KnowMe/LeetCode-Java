package com.github.No1KnowMe.exercise13;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    @DisplayName("Tests: romanNumber -> Integer")
    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "III, 3",
            "IV, 4",
            "IX, 9",
            "LVIII, 58",
            "MCMXCIV, 1994"
    })
    void romanToInt(String romanNumber, int expectedNumber){
        assertEquals(expectedNumber, RomanToInteger.romanToInt(romanNumber),
                () -> romanNumber + " should equal " + expectedNumber);
        }
}