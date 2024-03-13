package com.github.No1KnowMe.exersice1;

import java.util.*;

public class TwoSum {

    /* TODO: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    * You may assume that each input would have exactly one solution, and you may not use yhe same element twice.
    * Example:
    * Given nums = [2, 7, 11, 15], target = 9,
    * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].*/

    public static void main (String[] args) {
        List<Integer> nums = getNumsList();
        int target = getTargetInt();
        String result = getResult(nums, target);
        System.out.println(result);
    }

    /**
     * Get numbers list from User's prompt (System.in).
     * @return list of Integers
     * */
    public static List<Integer> getNumsList() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.print("Please, insert nums array: ");
        List<String> strNums = List.of(scanner.nextLine().replaceAll(" ", "").split(","));

        for (String num : strNums) {
            nums.add(Integer.valueOf(num));
        }

        return nums;
    }

    /**
     * Get target number from User's prompt (System.in).
     * @return int value
     * */
    public static int getTargetInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert target number: ");
        return scanner.nextInt();
    }

    /**
     * If nums list holds two numbers which give a sum of target value, then return indexes of those numbers in list.
     * @param nums The integer list which possibly holds sum of two numbers that give target value
     * @param target int value
     * @return indexes of numbers or message said that list doesn't have target sum.
     * */
    public static String getResult(List<Integer> nums, int target) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums.get(i);
            if (map.containsKey(complement)) {
                result.add(map.get(complement));
                result.add(i);
            }
            map.put(nums.get(i), i);
        }

        return (result.isEmpty()) ? "There is no sum.": result.toString();
    }
}
