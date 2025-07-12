package org.example.twopointers.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersections {

//    986. Interval List Intersections
//    Medium
//
//    You are given two lists of closed intervals, firstList and secondList, where firstList[i] = [starti, endi]
//    and secondList[j] = [startj, endj]. Each list of intervals is pairwise disjoint and in sorted order.
//
//    Return the intersection of these two interval lists.
//
//    A closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.
//
//    The intersection of two closed intervals is a set of real numbers that are either empty or represented as a
//    closed interval. For example, the intersection of [1, 3] and [2, 4] is [2, 3].

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(intervalIntersection(new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}},
                new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}}))); // [[1, 2], [5, 5], [8, 10], [15, 23], [24, 24], [25, 25]]
        System.out.println(Arrays.deepToString(intervalIntersection(new int[][]{{1, 3}, {5, 9}}, new int[][]{}))); // []
    }

//    Approach 1: Merge Intervals
//    Time complexity  : O(m + n)
//    Space complexity : O(m + n)

    public static int[][] intervalIntersection(int[][] nums1, int[][] nums2) {
        List<int[]> rsl = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            int left = Math.max(nums1[p1][0], nums2[p2][0]);
            int right = Math.min(nums1[p1][1], nums2[p2][1]);
            if (left <= right) {
                rsl.add(new int[]{left, right});
            }
            if (nums1[p1][1] < nums2[p2][1]) {
                p1++;
            } else {
                p2++;
            }
        }
        return rsl.toArray(new int[rsl.size()][]);
    }
}
