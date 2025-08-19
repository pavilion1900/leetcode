package org.example.array.task;

import java.util.Arrays;

public class MergeIntervals {

//    56. Merge Intervals
//    Medium
//
//    Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
//    and return an array of the non-overlapping intervals that cover all the intervals in the input.

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{2, 6}, {1, 3}, {8, 10}, {15, 18}}))); // [[1, 6], [8, 10], [15, 18]]
        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 4}, {4, 5}})));                    // [[1, 5]
    }

    public static int[][] merge(int[][] intervals) {
        return null;
    }
}
