package org.example.twopointers.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysII {

//    350. Intersection of Two Arrays II
//    Easy
//
//    Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result
//    must appear as many times as it shows in both arrays and you may return the result in any order.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));       // [2, 2]
        System.out.println(Arrays.toString(intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))); // [4, 9] || [9, 4]
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int p1 = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                nums1[p1++] = num;
                map.put(num, count - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, p1);
    }

//    public static int[] intersect(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int i = 0;
//        int j = 0;
//        int pointer = 0;
//        while (i < nums1.length && j < nums2.length) {
//            if (nums1[i] < nums2[j]) {
//                i++;
//            } else if (nums1[i] > nums2[j]) {
//                j++;
//            } else {
//                nums1[pointer++] = nums1[i++];
//                j++;
//            }
//        }
//        return Arrays.copyOfRange(nums1, 0, pointer);
//    }
}
