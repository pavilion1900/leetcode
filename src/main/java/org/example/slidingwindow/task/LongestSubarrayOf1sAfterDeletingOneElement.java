package org.example.slidingwindow.task;

public class LongestSubarrayOf1sAfterDeletingOneElement {

//    1493. Longest Subarray of 1's After Deleting One Element
//    Medium

//    Given a binary array nums, you should delete one element from it.
//    Return the size of the longest non-empty subarray containing only 1's in the resulting array.
//    Return 0 if there is no such subarray.

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{1, 1, 0, 1}));                // 3
        System.out.println(longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1})); // 5
        System.out.println(longestSubarray(new int[]{1, 1, 1}));                   // 2
    }

    public static int longestSubarray(int[] nums) {
        return -1;
    }
}
