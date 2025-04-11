package org.example.binarysearch.task;

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
        return new int[]{};
    }
}
