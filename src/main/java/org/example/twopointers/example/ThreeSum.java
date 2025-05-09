package org.example.twopointers.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

//        15. 3Sum
//        Medium
//
//        Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such
//        that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//        Notice that the solution set must not contain duplicate triplets.

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));  // [[-1, -1, 2],[-1, 0, 1]]
        System.out.println(threeSum(new int[]{0, 1, 1}));              // []
        System.out.println(threeSum(new int[]{0, 0, 0}));              // [[0, 0, 0]]
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                twoSum(nums, i, list);
            }
        }
        return list;
    }

    private static void twoSum(int[] nums, int index, List<List<Integer>> list) {
        int left = index + 1;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[index] + nums[left] + nums[right];
            if (sum == 0) {
                list.add(List.of(nums[index], nums[left++], nums[right--]));
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
            } else if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }
    }
}
