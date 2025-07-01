package org.example.binarysearch.example;

public class PeakIndexInAMountainArray {

//    852. Peak Index in a Mountain Array
//    Medium
//
//    You are given an integer mountain array arr of length n where the values increase to a peak element
//    and then decrease.
//    Return the index of the peak element.

    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0, 1, 0}));     // 1
        System.out.println(peakIndexInMountainArray(new int[]{0, 2, 1, 0}));  // 1
        System.out.println(peakIndexInMountainArray(new int[]{0, 10, 5, 2})); // 1
    }

//    Approach 1: Linear Scan [Don't use]
//    Time complexity  : O(N)
//    Space complexity : O(1)

//    public static int peakIndexInMountainArray(int[] arr) {
//        int index = 0;
//        while (arr[index] < arr[index + 1]) {
//            index++;
//        }
//        return index;
//    }

//    Approach 2: Binary Search
//    Time complexity  : O(log N)
//    Space complexity : O(1)

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int midInd = (left + right) >>> 1;
            int midVal = arr[midInd];
            if (midVal > arr[midInd + 1]) {
                right = midInd;
            } else {
                left = midInd + 1;
            }
        }
        return left;
    }
}
