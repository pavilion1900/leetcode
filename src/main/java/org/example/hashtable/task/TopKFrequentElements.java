package org.example.hashtable.task;

import java.util.Arrays;

public class TopKFrequentElements {

//        347. Top K Frequent Elements
//        Medium
//
//        Given an integer array nums and an integer k, return the k most frequent elements.
//        You may return the answer in any order.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2))); // [1, 2]
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));                // [1]
    }

    public static int[] topKFrequent(int[] nums, int k) {
        return null;
    }
}
