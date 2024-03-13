package com.github.No1KnowMe.exersice7;

import java.util.Scanner;

public class ReverseInteger {

    /* TODO: Given a 32-bit signed integer, reverse digits of an integer.
    * Example 1:
    * Input: 123
    * Output: 321
    *
    * Example 2:
    * Input: -123
    * Output: -321
    *
    * Example 3:
    * Input: 120
    * Output: 21
    *
    * Note:
    * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
    * [-231, 231-1]. For the purpose of this problem, assume that your function return 0 when the reversed integer
    * overflows.
    * */

    public static void main(String[] args) {
        System.out.println(reverse(getUserPrompt()));
    }

    /**
     * Get user's prompt from console.
     * @return int value of prompt.*/
    public static int getUserPrompt () {
        System.out.print("Please, type a number to reverse: ");
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return result;
        }
    }

    public static int reverse (int number) {
        long out = 0;
        while (number != 0) {
            out = out * 10 + number % 10;
            number /= 10;
        }
        if (out > Integer.MAX_VALUE || out < Integer.MIN_VALUE) out = 0;
        return (int) out;
    }
}
