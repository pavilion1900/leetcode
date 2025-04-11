package org.example.binarysearch.task;

public class SearchInRotatedSortedArray {

//        33. Search in Rotated Sorted Array
//        Medium
//
//        There is an integer array nums sorted in ascending order (with distinct values).
//        Prior to being passed to your function, nums is possibly rotated at an unknown pivot index
//        k (1 <= k < nums.length) such that the resulting array is
//        [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
//        For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//        Given the array nums after the possible rotation and an integer target, return the index of target
//        if it is in nums, or -1 if it is not in nums.

    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)); // 4
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1)); // 5
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)); // -1
        System.out.println(search(new int[]{1, 3}, 3));                // 1
        System.out.println(search(new int[]{1}, 0));                   // -1
    }

    public static int search(int[] nums, int target) {
        return -1;
    }
}
