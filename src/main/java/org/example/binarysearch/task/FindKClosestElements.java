package org.example.binarysearch.task;

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

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        return null;
    }
}
