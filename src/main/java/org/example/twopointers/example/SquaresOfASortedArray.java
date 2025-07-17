package org.example.twopointers.example;

import java.util.Arrays;

public class SquaresOfASortedArray {

//    977. Squares of a Sorted Array
//    Easy
//
//    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number
//    sorted in non-decreasing order.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10}))); // [0, 1, 9, 16, 100]
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11}))); // [4, 9, 9, 49, 121]
    }

//    Approach 1: Sort
//    Time complexity  : O(N * log(n))
//    Space complexity : O(N) or O(lon(n))
//
//    public static int[] sortedSquares(int[] nums) {
//        int arrLen = nums.length;
//        int[] rsl = new int[arrLen];
//        for (int i = 0; i < arrLen; i++) {
//            rsl[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(rsl);
//        return rsl;
//    }

//    Approach 2: Two Pointer
//    Time complexity  : O(N)
//    Space complexity : O(N) if you take output into account and O(1) otherwise.

    public static int[] sortedSquares(int[] nums) {
        int arrLen = nums.length;
        int left = 0;
        int right = arrLen - 1;
        int[] rsl = new int[arrLen];
        for (int i = arrLen - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right--];
            } else {
                square = nums[left++];
            }
            rsl[i] = square * square;
        }
        return rsl;
    }
}
