package org.example.array.example;

import java.util.HashSet;
import java.util.Set;

public class LineReflection {

//    356. Line Reflection
//    Medium
//
//    Given n points on a 2D plane, find if there is such a line parallel to the y-axis that reflects
//    the given points symmetrically.
//
//    In other words, answer whether or not if there exists a line that after reflecting all points over
//    the given line, the original points' set is the same as the reflected ones.
//
//    Note that there can be repeated points.

    public static void main(String[] args) {
        System.out.println(isReflected(new int[][]{{1, 1}, {-1, 1}}));  // true
        System.out.println(isReflected(new int[][]{{1, 1}, {-1, -1}})); // false
        System.out.println(isReflected(new int[][]{{0, 0}, {1, 0}}));   // true
    }

//    Time complexity  : O(N)
//    Space complexity : O(N)

    public static boolean isReflected(int[][] points) {
        if (points == null || points.length == 0) {
            return true;
        }

        Set<String> pointSet = new HashSet<>();
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            pointSet.add(x + "," + y);
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
        }
        int sum = minX + maxX;

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            if (!pointSet.contains((sum - x) + "," + y)) {
                return false;
            }
        }
        return true;
    }
}
