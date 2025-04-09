package org.example.twopointers.task;

import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
//        15. 3Sum
//        Medium
//
//        Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such
//        that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//        Notice that the solution set must not contain duplicate triplets.

        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));  // [[-1, -1, 2],[-1, 0, 1]]
        System.out.println(threeSum(new int[]{0, 1, 1}));              // []
        System.out.println(threeSum(new int[]{0, 0, 0}));              // [[0, 0, 0]]
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        return null;
    }
}
