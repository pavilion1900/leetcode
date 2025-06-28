package org.example.binarysearch.task;

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

    public static int searchInsert(int[] nums, int target) {
        return -1;
    }
}
