package org.example.twopointers.task;

import java.util.Arrays;

public class MergeSortedArray {

//    88. Merge Sorted Array
//    Easy
//
//    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
//    representing the number of elements in nums1 and nums2 respectively.
//    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//    The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
//    To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that
//    should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] array2 = new int[]{2, 5, 6};
        merge(array1, 3, array2, 3);
        System.out.println(Arrays.toString(array1)); // [1, 2, 2, 3, 5, 6]

        int[] array3 = new int[]{1};
        int[] array4 = new int[]{};
        merge(array3, 1, array4, 0);
        System.out.println(Arrays.toString(array3)); // [1]

        int[] array5 = new int[]{0};
        int[] array6 = new int[]{1};
        merge(array5, 0, array6, 1);
        System.out.println(Arrays.toString(array5)); // [1]
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

    }
}
