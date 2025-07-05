package org.example.array.task;

public class SubarraySumEqualsK {

//    560. Subarray Sum Equals K
//    Medium
//
//    Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//
//    A subarray is a contiguous non-empty sequence of elements within an array.

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));  // 2
        System.out.println(subarraySum(new int[]{1, 2, 3}, 3));  // 2
        System.out.println(subarraySum(new int[]{1, -1, 0}, 0)); // 3
    }

    public static int subarraySum(int[] nums, int k) {
        return -1;
    }
}
