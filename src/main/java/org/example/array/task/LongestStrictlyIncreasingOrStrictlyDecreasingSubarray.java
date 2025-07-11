package org.example.array.task;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {

//    3105. Longest Strictly Increasing or Strictly Decreasing Subarray
//    Easy
//
//    You are given an array of integers nums. Return the length of the longest subarray of nums which is either
//    strictly increasing or strictly decreasing.

    public static void main(String[] args) {
        System.out.println(longestMonotonicSubarray(new int[]{1, 4, 3, 3, 2})); // 2
        System.out.println(longestMonotonicSubarray(new int[]{3, 3, 3, 3}));    // 1
        System.out.println(longestMonotonicSubarray(new int[]{3, 2, 1}));       // 3
    }

    public static int longestMonotonicSubarray(int[] nums) {
        return -1;
    }
}
