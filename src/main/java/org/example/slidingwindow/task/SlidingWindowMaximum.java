package org.example.slidingwindow.task;

import java.util.Arrays;

public class SlidingWindowMaximum {

//    239. Sliding Window Maximum
//    Hard
//
//    You are given an array of integers nums, there is a sliding window of size k which is moving from the very left
//    of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves
//    right by one position.
//
//    Return the max sliding window.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3))); // [3, 3, 5, 5, 6, 7]
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1}, 1)));                        // [1]
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, 1, 2, 0, 5}, 3)));         // [3, 3, 2, 5]
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        return null;
    }
}
