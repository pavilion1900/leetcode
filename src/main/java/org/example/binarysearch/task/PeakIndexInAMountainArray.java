package org.example.binarysearch.task;

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

    public static int peakIndexInMountainArray(int[] arr) {
        return -1;
    }
}
