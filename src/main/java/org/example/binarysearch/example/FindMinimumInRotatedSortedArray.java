package org.example.binarysearch.example;

public class FindMinimumInRotatedSortedArray {

//    153. Find Minimum in Rotated Sorted Array
//    Medium
//
//    Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
//    For example, the array nums = [0,1,2,4,5,6,7] might become:
//
//    - [4,5,6,7,0,1,2] if it was rotated 4 times.
//    - [0,1,2,4,5,6,7] if it was rotated 7 times.
//
//    Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results
//    in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//    Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//    You must write an algorithm that runs in O(log n) time.

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));       // 1
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2})); // 0
        System.out.println(findMin(new int[]{11, 13, 15, 17}));      // 11
    }

//    Approach 1: Binary Search
//    Time complexity  : O(log N)
//    Space complexity : O(1)

    public static int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;

        if (nums[right] > nums[0]) {
            return nums[0];
        }

        while (left <= right) {
            int midInd = (left + right) >>> 1;
            int midVal = nums[midInd];
            if (midVal > nums[midInd + 1]) {
                return nums[midInd + 1];
            }
            if (nums[midInd - 1] > midVal) {
                return midVal;
            }
            if (midVal > nums[0]) {
                left = midInd + 1;
            } else {
                right = midInd - 1;
            }
        }
        return Integer.MAX_VALUE;
    }
}
