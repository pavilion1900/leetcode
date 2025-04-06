package org.example.twopointers.example;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
//        88. Merge Sorted Array
//        Easy
//
//        You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
//        representing the number of elements in nums1 and nums2 respectively.
//        Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//        The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
//        To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that
//        should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

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
        int p1 = m - 1;
        int p2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1--];
            } else {
                nums1[i] = nums2[p2--];
            }
        }
    }
}
