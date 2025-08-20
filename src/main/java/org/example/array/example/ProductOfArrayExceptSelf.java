package org.example.array.example;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

//    238. Product of Array Except Self
//    Medium
//
//    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all
//    the elements of nums except nums[i].
//
//    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//    You must write an algorithm that runs in O(n) time and without using the division operation.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));      // [24, 12, 8, 6]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3}))); // [0, 0, 9, 0, 0]
    }

//    Approach 1: Left and Right product lists
//    Time complexity  : O(N)
//    Space complexity : O(N)
//
//    public static int[] productExceptSelf(int[] nums) {
//        int arrLen = nums.length;
//
//        int[] left = new int[arrLen];
//        int[] right = new int[arrLen];
//        int[] rsl = new int[arrLen];
//
//        left[0] = 1;
//        for (int i = 1; i < arrLen; i++) {
//            left[i] = nums[i - 1] * left[i - 1];
//        }
//
//        right[arrLen - 1] = 1;
//        for (int i = arrLen - 2; i >= 0; i--) {
//            right[i] = nums[i + 1] * right[i + 1];
//        }
//
//        for (int i = 0; i < arrLen; i++) {
//            rsl[i] = left[i] * right[i];
//        }
//        return rsl;
//    }
//
//    Approach 2: O(1) space approach
//    Time complexity  : O(N)
//    Space complexity : O(1)

    public static int[] productExceptSelf(int[] nums) {
        int arrLen = nums.length;
        int[] rsl = new int[arrLen];

        rsl[0] = 1;
        for (int i = 1; i < arrLen; i++) {
            rsl[i] = nums[i - 1] * rsl[i - 1];
        }

        int right = 1;
        for (int i = arrLen - 1; i >= 0; i--) {
            rsl[i] = rsl[i] * right;
            right *= nums[i];
        }
        return rsl;
    }
}
