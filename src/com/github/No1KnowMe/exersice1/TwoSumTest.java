package com.github.No1KnowMe.exersice1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void getResult_LIST_WITH_SUM() {
        List<Integer> testNums = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int testTarget = 9;
        String message = "[0, 1]";
        String testResult = TwoSum.getResult(testNums, testTarget);

        assertEquals(message, testResult);
        String result = (message.equals(testResult)) ? "TEST 1 PASSED" : "TEST 1 FAILED";
        System.out.println(result);
    }

    @Test
    void getResult_LIST_WITHOUT_SUM() {
        List<Integer> testNums = new ArrayList<>(Arrays.asList(2, 3, 11, 15));
        int testTarget = 21;
        String message = "There is no sum.";
        String testResult = TwoSum.getResult(testNums, testTarget);

        assertEquals(message, testResult);
        String result = (message.equals(testResult)) ? "TEST 2 PASSED" : "TEST 2 FAILED";
        System.out.println(result);
    }
}