package org.example.array.example;

import java.util.Arrays;
import java.util.LinkedList;

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

//    Approach 2: Sorting
//    Time complexity  : O(n * log(n))
//    Space complexity : O(log(n)) or O(n)

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (first, second) -> Integer.compare(first[0], second[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
