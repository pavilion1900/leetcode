package org.example.slidingwindow.example;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

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

//    public static int[] maxSlidingWindow(int[] nums, int k) {
//        Deque<Integer> queue = new ArrayDeque<>();
//        List<Integer> rsl = new ArrayList<>();
//
//        for (int i = 0; i < k; i++) {
//            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
//                queue.pollLast();
//            }
//            queue.offerLast(i);
//        }
//        rsl.add(nums[queue.peekFirst()]);
//
//        for (int i = k; i < nums.length; i++) {
//            if (queue.peekFirst() == i - k) {
//                queue.pollFirst();
//            }
//            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
//                queue.pollLast();
//            }
//            queue.offerLast(i);
//            rsl.add(nums[queue.peekFirst()]);
//        }
//        return rsl.stream()
//                .mapToInt(num -> num)
//                .toArray();
//    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int index = 0;
        int[] rsl = new int[nums.length - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();

        while (right < nums.length) {
            int rVal = nums[right];
            while (!queue.isEmpty() && rVal > queue.peekLast()) {
                queue.pollLast();
            }
            queue.offerLast(rVal);
            if (right - left + 1 == k) {
                rsl[index++] = queue.peekFirst();
                if (queue.peekFirst() == nums[left]) {
                    queue.pollFirst();
                }
                left++;
            }
            right++;
        }
        return rsl;
    }
}
