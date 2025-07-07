package org.example.array.task;

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

    public static boolean isReflected(int[][] points) {
        return false;
    }
}
