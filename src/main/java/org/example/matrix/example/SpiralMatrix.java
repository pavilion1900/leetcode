package org.example.matrix.example;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

//    54. Spiral Matrix
//    Medium
//
//    Given an m x n matrix, return all elements of the matrix in spiral order.

    public static void main(String[] args) {
        int[][] mat1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(mat1)); // [1, 2, 3, 6, 9, 8, 7, 4, 5]
        int[][] mat2 = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(spiralOrder(mat2)); // [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> rsl = new ArrayList<>();
        int rows = matrix.length;
        int cols = rows > 0 ? matrix[0].length : 0;
        int right = cols - 1;
        int down = rows - 1;
        int left = 0;
        int up = 0;
        while (rsl.size() < rows * cols) {
            for (int col = left; col <= right; col++) {
                rsl.add(matrix[up][col]);
            }
            for (int row = up + 1; row <= down; row++) {
                rsl.add(matrix[row][right]);
            }
            if (up != down) {
                for (int col = right - 1; col >= left; col--) {
                    rsl.add(matrix[down][col]);
                }
            }
            if (left != right) {
                for (int row = down - 1; row > up; row--) {
                    rsl.add(matrix[row][left]);
                }
            }
            right--;
            down--;
            left++;
            up++;
        }
        return rsl;
    }
}
