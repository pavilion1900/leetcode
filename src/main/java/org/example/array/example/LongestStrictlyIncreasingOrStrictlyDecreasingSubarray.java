package org.example.array.example;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {

//    3105. Longest Strictly Increasing or Strictly Decreasing Subarray
//    Easy
//
//    You are given an array of integers nums. Return the length of the longest subarray of nums which is either
//    strictly increasing or strictly decreasing.

    public static void main(String[] args) {
        System.out.println(longestMonotonicSubarray(new int[]{1, 4, 3, 3, 2})); // 2
        System.out.println(longestMonotonicSubarray(new int[]{3, 3, 3, 3}));    // 1
        System.out.println(longestMonotonicSubarray(new int[]{3, 2, 1}));       // 3
    }

//    Approach 1: Brute Force (Don't use)
//    Time complexity  : O(N2)
//    Space complexity : O(1)

//    public static int longestMonotonicSubarray(int[] nums) {
//        int maxLen = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int currLen = 1;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] > nums[j - 1]) {
//                    currLen++;
//                } else {
//                    break;
//                }
//            }
//            maxLen = Math.max(maxLen, currLen);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int currLen = 1;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] < nums[j - 1]) {
//                    currLen++;
//                } else {
//                    break;
//                }
//            }
//            maxLen = Math.max(maxLen, currLen);
//        }
//        return maxLen;
//    }

//    Approach 2: Single Iteration
//    Time complexity  : O(N)
//    Space complexity : O(1)

    public static int longestMonotonicSubarray(int[] nums) {
        int incLen = 1;
        int decLen = 1;
        int maxLen = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                incLen++;
                decLen = 1;
            } else if (nums[i + 1] < nums[i]) {
                decLen++;
                incLen = 1;
            } else {
                incLen = 1;
                decLen = 1;
            }
            maxLen = Math.max(maxLen, Math.max(incLen, decLen));
        }
        return maxLen;
    }
}
