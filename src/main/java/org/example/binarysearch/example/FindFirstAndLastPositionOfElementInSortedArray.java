package org.example.binarysearch.example;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

//    34. Find First and Last Position of Element in Sorted Array
//    Medium
//
//    Given an array of integers nums sorted in non-decreasing order, find the starting and ending position
//    of a given target value.
//    If target is not found in the array, return [-1, -1].

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8))); // [3, 4]
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6))); // [-1, -1]
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));                  // [-1, -1]
        System.out.println(Arrays.toString(searchRange(new int[]{1, 2, 3}, 1)));           // [0, 0]
    }

//    Approach: Binary Search
//    Time complexity  : O(log N)
//    Space complexity : O(1)

    public static int[] searchRange(int[] nums, int target) {
        int left = findBound(nums, target, true);
        if (left == -1) {
            return new int[]{-1, -1};
        }
        int right = findBound(nums, target, false);
        return new int[]{left, right};
    }

    private static int findBound(int[] nums, int target, boolean flag) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midInd = (left + right) >>> 1;
            int midVal = nums[midInd];
            if (midVal == target) {
                if (flag) {
                    if (midInd == left || nums[midInd - 1] != target) {
                        return midInd;
                    }
                    right = midInd - 1;
                } else {
                    if (midInd == right || nums[midInd + 1] != target) {
                        return midInd;
                    }
                    left = midInd + 1;
                }
            } else if (midVal > target) {
                right = midInd - 1;
            } else {
                left = midInd + 1;
            }
        }
        return -1;
    }
}
