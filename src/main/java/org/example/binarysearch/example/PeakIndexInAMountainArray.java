package org.example.binarysearch.example;

public class PeakIndexInAMountainArray {

    public static void main(String[] args) {
//        852. Peak Index in a Mountain Array
//        Medium
//
//        You are given an integer mountain array arr of length n where the values increase to a peak element
//        and then decrease.
//        Return the index of the peak element.

        System.out.println(peakIndexInMountainArray(new int[]{0, 1, 0}));     // 1
        System.out.println(peakIndexInMountainArray(new int[]{0, 2, 1, 0}));  // 1
        System.out.println(peakIndexInMountainArray(new int[]{0, 10, 5, 2})); // 1
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = ++mid;
            }
        }
        return left;
    }
}
