package com.github.No1KnowMe.exersice7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @DisplayName("Reverse an int number. If a reversed int is bigger than range then result 0.")
    @ParameterizedTest(name = "{0} is a reversed {1}")
    @CsvSource({
            "123, 321",
            "-123, -321",
            "120, 21",
            "1000000003, 0"
    })
    void reverse(int number, int expectedResult) {
        assertEquals(expectedResult, ReverseInteger.reverse(number),
                () -> number + " should be a reversed " + expectedResult);
    }
}