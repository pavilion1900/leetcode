package org.example.hashtable.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

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
        if (nums.length == k) {
            return nums;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Queue<Integer> queue = new PriorityQueue<>((key1, key2) -> map.get(key1) - map.get(key2));
        for (int num : map.keySet()) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        int[] top = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            top[i] = queue.poll();
        }
        return top;
    }
}
