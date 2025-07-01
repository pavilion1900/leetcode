package org.example.binarysearch.example;

public class SearchInsertPosition {

//    35. Search Insert Position
//    Easy
//
//    Given a sorted array of distinct integers and a target value, return the index if the target is found.
//    If not, return the index where it would be if it were inserted in order.

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1}, 1));           // 0
        System.out.println(searchInsert(new int[]{1}, 2));           // 1
        System.out.println(searchInsert(new int[]{1}, 0));           // 0
        System.out.println(searchInsert(new int[]{1, 3}, 2));        // 1
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));  // 2
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));  // 1
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));  // 4
    }

//    Approach 1: Binary Search
//    Time complexity  : O(log N)
//    Space complexity : O(1)

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midInd = (left + right) >>> 1;
            int midVal = nums[midInd];
            if (midVal == target) {
                return midInd;
            } else if (midVal > target) {
                right = midInd - 1;
            } else {
                left = midInd + 1;
            }
        }
        return left;
    }
}
