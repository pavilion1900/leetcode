package org.example.twopointers.task;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
//        75. Sort Colors
//        Medium
//
//        Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects
//        of the same color are adjacent, with the colors in the order red, white, and blue.
//        We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//        You must solve this problem without using the library's sort function.

        int[] array1 = new int[]{2, 0, 2, 1, 1, 0};
        int[] array2 = new int[]{2, 0, 1};
        int[] array3 = new int[]{1, 2, 0};
        sortColors(array1);
        sortColors(array2);
        sortColors(array3);
        System.out.println(Arrays.toString(array1)); // [0, 0, 1, 1, 2, 2]
        System.out.println(Arrays.toString(array2)); // [0, 1, 2]
        System.out.println(Arrays.toString(array3)); // [0, 1, 2]
    }

    public static void sortColors(int[] nums) {

    }
}
