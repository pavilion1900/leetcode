package org.example.hashtable.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//        1. Two Sum
//        Easy
//
//        Given an array of integers nums and an integer target, return indices of the two numbers such that
//        they add up to target.
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//        You can return the answer in any order.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 11, 7, 15}, 9))); // [0, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));         // [0, 1]
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
