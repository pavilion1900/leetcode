package org.example.twopointers.task;

public class RemoveDuplicatesFromSortedArray {

//        26. Remove Duplicates from Sorted Array
//        Easy
//
//        Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such
//        that each unique element appears only once. The relative order of the elements should be kept the same.
//        Then return the number of unique elements in nums.
//        Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//        Change the array nums such that the first k elements of nums contain the unique elements in the order
//        they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
//        Return k.

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{}));                               // 0
        System.out.println(removeDuplicates(new int[]{1}));                              // 1
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));                        // 2
        System.out.println(removeDuplicates(new int[]{1, 2, 3}));                        // 3
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 2}));                     // 2
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 3}));                     // 3
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));   // 5
    }

    public static int removeDuplicates(int[] nums) {
        return -1;
    }
}
