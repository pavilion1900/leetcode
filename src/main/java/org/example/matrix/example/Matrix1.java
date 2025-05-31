package org.example.matrix.example;

import java.util.Arrays;

public class Matrix1 {

//    542. 01 Matrix
//    Medium
//
//    Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
//
//    The distance between two cells sharing a common edge is 1.

    public static void main(String[] args) {
        int[][] mat1 = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        System.out.println(Arrays.deepToString(updateMatrix(mat1))); // [[0, 0, 0], [0, 1, 0], [0, 0, 0]]
        int[][] mat2 = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        System.out.println(Arrays.deepToString(updateMatrix(mat2))); // [[0, 0, 0], [0, 1, 0], [1, 2, 1]]
    }

    public static int[][] updateMatrix(int[][] mat) {
        int height = mat.length;
        int width = mat[0].length;
        int[][] rsl = new int[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                rsl[row][col] = mat[row][col];
            }
        }
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (rsl[row][col] == 0) {
                    continue;
                }
                int minVal = height * width;
                if (row > 0) {
                    minVal = Math.min(minVal, rsl[row - 1][col]);
                }
                if (col > 0) {
                    minVal = Math.min(minVal, rsl[row][col - 1]);
                }
                rsl[row][col] = minVal + 1;
            }
        }
        for (int row = height - 1; row >= 0; row--) {
            for (int col = width - 1; col >= 0; col--) {
                if (rsl[row][col] == 0) {
                    continue;
                }
                int minVal = height * width;
                if (row < height - 1) {
                    minVal = Math.min(minVal, rsl[row + 1][col]);
                }
                if (col < width - 1) {
                    minVal = Math.min(minVal, rsl[row][col + 1]);
                }
                rsl[row][col] = Math.min(rsl[row][col], minVal + 1);
            }
        }
        return rsl;
    }
}
