package org.example.binarysearch.example;

public class MedianOfTwoSortedArrays {

//    4. Median of Two Sorted Arrays
//    Hard
//
//    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//    The overall run time complexity should be O(log (m+n)).

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));    // 2.0
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})); // 2.5
    }

//    Approach 3: A Better Binary Search
//    Time complexity  : O(log(min(m,n)))
//    Space complexity : O(1)

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1Len = nums1.length;
        int n2Len = nums2.length;
        int left = 0;
        int right = n1Len;

        while (left <= right) {
            int mid1Ind = (left + right) >>> 1;
            int mid2Ind = ((n1Len + n2Len + 1) >>> 1) - mid1Ind;
            int max1Left = (mid1Ind == 0) ? Integer.MIN_VALUE : nums1[mid1Ind - 1];
            int min1Right = (mid1Ind == n1Len) ? Integer.MAX_VALUE : nums1[mid1Ind];
            int max2Left = (mid2Ind == 0) ? Integer.MIN_VALUE : nums2[mid2Ind - 1];
            int min2Right = (mid2Ind == n2Len) ? Integer.MAX_VALUE : nums2[mid2Ind];

            if (max1Left <= min2Right && max2Left <= min1Right) {
                if (((n1Len + n2Len) & 1) == 0) {
                    return (Math.max(max1Left, max2Left) + Math.min(min1Right, min2Right)) / 2.0;
                } else {
                    return Math.max(max1Left, max2Left);
                }
            } else if (max1Left > min2Right) {
                right = mid1Ind - 1;
            } else {
                left = mid1Ind + 1;
            }
        }
        return 0.0;
    }
}
