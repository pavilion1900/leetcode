package org.example.twopointers.task;

import java.util.Arrays;

public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {
//        350. Intersection of Two Arrays II
//        Easy
//
//        Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result
//        must appear as many times as it shows in both arrays and you may return the result in any order.

        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));       // [2, 2]
        System.out.println(Arrays.toString(intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))); // [4, 9] || [9, 4]
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        return new int[]{};
    }
}
