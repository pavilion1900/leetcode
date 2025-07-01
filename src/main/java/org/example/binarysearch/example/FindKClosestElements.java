package org.example.binarysearch.example;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {

//    658. Find K Closest Elements
//    Medium
//
//    Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
//    The result should also be sorted in ascending order.
//
//    An integer a is closer to x than an integer b if:
//
//    |a - x| < |b - x|, or
//    |a - x| == |b - x| and a < b

    public static void main(String[] args) {
        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3));     // [1, 2, 3, 4]
        System.out.println(findClosestElements(new int[]{1, 1, 2, 3, 4, 5}, 4, -1)); // [1, 1, 2, 3]
    }

//    Approach 1: Sort With Custom Comparator
//    Time complexity  : O(N * log(N) + k * log(k))
//    Space complexity : O(N)
//
//    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
//        List<Integer> sortedArr = new ArrayList<>();
//        for (int num : arr) {
//            sortedArr.add(num);
//        }
//
//        Collections.sort(sortedArr, (first, second) -> Math.abs(first - x) - Math.abs(second - x));
//        sortedArr = sortedArr.subList(0, k);
//        Collections.sort(sortedArr);
//        return sortedArr;
//    }

//    Approach 3: Binary Search To Find The Left Bound
//    Time complexity  : O(log(N - k) + k)
//    Space complexity : O(1)

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - k;

        while (left < right) {
            int midInd = (left + right) >>> 1;
            int midVal = arr[midInd];
            if (x - midVal > arr[midInd + k] - x) {
                left = midInd + 1;
            } else {
                right = midInd;
            }
        }

        List<Integer> rsl = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            rsl.add(arr[i]);
        }
        return rsl;
    }
}
