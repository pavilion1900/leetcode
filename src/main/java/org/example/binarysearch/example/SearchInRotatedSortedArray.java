package org.example.binarysearch.example;

public class SearchInRotatedSortedArray {

//    33. Search in Rotated Sorted Array
//    Medium
//
//    There is an integer array nums sorted in ascending order (with distinct values).
//    Prior to being passed to your function, nums is possibly rotated at an unknown pivot index
//    k (1 <= k < nums.length) such that the resulting array is
//    [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
//    For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//    Given the array nums after the possible rotation and an integer target, return the index of target
//    if it is in nums, or -1 if it is not in nums.

    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)); // 4
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1)); // 5
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)); // -1
        System.out.println(search(new int[]{1, 3}, 3));                // 1
        System.out.println(search(new int[]{1}, 0));                   // -1
    }

//    Approach 1: Find Pivot Index + Binary Search
//    Time complexity  : O(log N)
//    Space complexity : O(1)
//
//    public static int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            int middle = left + (right - left) / 2;
//            if (nums[middle] > nums[nums.length - 1]) {
//                left = ++middle;
//            } else {
//                right = --middle;
//            }
//        }
//        int index = binarySearch(nums, 0, left - 1, target);
//        if (index != -1) {
//            return index;
//        }
//        return binarySearch(nums, left, nums.length - 1, target);
//    }
//
//    private static int binarySearch(int[] nums, int left, int right, int target) {
//        while (left <= right) {
//            int middle = left + (right - left) / 2;
//            if (nums[middle] == target) {
//                return middle;
//            } else if (nums[middle] > target) {
//                right = --middle;
//            } else {
//                left = ++middle;
//            }
//        }
//        return -1;
//    }

//    Approach 3: One Binary Search
//    Time complexity  : O(log N)
//    Space complexity : O(1)

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midInd = (left + right) >>> 1;
            int midVal = nums[midInd];
            if (midVal == target) {
                return midInd;
            } else if (midVal >= nums[left]) {
                if (target >= nums[left] && target < midVal) {
                    right = midInd - 1;
                } else {
                    left = midInd + 1;
                }
            } else {
                if (target > midVal && target <= nums[right]) {
                    left = midInd + 1;
                } else {
                    right = midInd - 1;
                }
            }
        }
        return -1;
    }
}
