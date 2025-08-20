package org.example.array.task;

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

    public static int[] productExceptSelf(int[] nums) {
        return null;
    }
}
