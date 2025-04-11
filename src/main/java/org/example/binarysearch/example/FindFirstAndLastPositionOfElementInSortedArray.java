package org.example.binarysearch.example;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

//        34. Find First and Last Position of Element in Sorted Array
//        Medium
//
//        Given an array of integers nums sorted in non-decreasing order, find the starting and ending position
//        of a given target value.
//        If target is not found in the array, return [-1, -1].

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8))); // [3, 4]
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6))); // [-1, -1]
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));                  // [-1, -1]
        System.out.println(Arrays.toString(searchRange(new int[]{1, 2, 3}, 1)));           // [0, 0]
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    private static int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] == target) {
                if (isFirst) {
                    if (mid == left || nums[mid - 1] != target) {
                        return mid;
                    }
                    right = --mid;
                } else {
                    if (mid == right || nums[mid + 1] != target) {
                        return mid;
                    }
                    left = ++mid;
                }
            } else if (nums[mid] > target) {
                right = --mid;
            } else {
                left = ++mid;
            }
        }
        return -1;
    }
}
