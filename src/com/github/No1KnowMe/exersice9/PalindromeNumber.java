package com.github.No1KnowMe.exersice9;

import java.util.Scanner;

public class PalindromeNumber {

    /* TODO: Determine whether an integer is a palindrome.
    * An integer is a palindrome when it reads the same backward as forward.
    *
    * Example 1:
    * Input: 121
    * Output: true
    *
    * Example 2:
    * Input: -121
    * Output: false
    * Explanation: From left to right, it reads -121. From right to left, it reads 121-.
    * Therefore it's not a palindrome.
    *
    * Example 3:
    * Input: 10
    * Output: false
    * Explanation: Reads 01 from right to left. Therefore it's not a palindrome.
    * */

    public static void main(String[] args) {
        System.out.println(checkPalindrome(getUserInput()));;
    }

    /**
     * Get user's prompt from console.
     * @return int value of prompt.
     * */
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Get user's prompt from console.
     * @param number int value to validate.
     * @return int value of prompt.
     * */
    public static boolean checkPalindrome(int number) {
        boolean result = true;
        int num = number;

        if (number < 0) {
            result = false;
        } else {
            long out = 0;
            while (number != 0) {
                out = out * 10 + number % 10;
                number /= 10;
            }
            result = (num == out);
        }
        return result;
    }

}
