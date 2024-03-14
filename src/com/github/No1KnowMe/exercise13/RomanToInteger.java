package com.github.No1KnowMe.exercise13;

import java.util.Scanner;

public class RomanToInteger {

    /* TODO:Given a roman numeral, convert it to an integer.
     * Roman numeral are represented by seven different symbols:
     * "I" (1), "V" (5), "X" (10), "L" (50), "C" (100), "D" (500) and "M" (1000).
     *
     * Example 1:
     * Input: "III"
     * Output: 3
     *
     * Example 2:
     * Input: "IV"
     * Output: 4
     *
     * Example 3:
     * Input: "IX"
     * Output: 9
     *
     * Example 4:
     * Input: "LVIII"
     * Output: 58
     *
     * Example 5:
     * Input: "MCMXCIV"
     * Output: 1994
     */

    public static void main (String[] args) {
        System.out.println(romanToInt(getUserPrompt()));
    }

    /**
     * Get user's prompt from console.
     * @return String value of prompt.
     * */
    public static String getUserPrompt () {
        System.out.print("Please, type a number to reverse: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Converts roman to arabic numbers.
     * @param romanNumbers Roman numbers to convert.
     * @return int value of converted numbers.
     * */
    public static int romanToInt (String romanNumbers) {
        int result = 0;
        for (int i = romanNumbers.length() - 1; i >= 0; i--) {
            char currentChar = romanNumbers.charAt(i);
            switch (currentChar){
                case 'I' -> result += (result >= 5 ? -1 : 1);
                case 'V' -> result += (result >= 10 ? -5 : 5);
                case 'X' -> result += (result >= 50 ? -10 : 10);
                case 'L' -> result += (result >= 100 ? -50 : 50);
                case 'C' -> result += (result >= 500 ? -100 : 100);
                case 'D' -> result += (result >= 1000 ? -500 : 500);
                case 'M' -> result += 1000;
            }
        }
        return result;
    }
}
