package org.example.matrix.example;

import java.util.Arrays;

public class RotateImage {

//    48. Rotate Image
//    Medium
//
//    You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//
//    You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
//    DO NOT allocate another 2D matrix and do the rotation.

    public static void main(String[] args) {
        int[][] mat1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(mat1);
        System.out.println(Arrays.deepToString(mat1)); // [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
        int[][] mat2 = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        rotate(mat2);
        System.out.println(Arrays.deepToString(mat2)); // [[15, 13, 2, 5], [14, 3, 4, 1], [12, 6, 8, 9], [16, 7, 10, 11]]
    }

    public static void rotate(int[][] matrix) {
        int num = matrix.length;
        for (int i = 0; i < (num + 1) / 2; i++) {
            for (int j = 0; j < num / 2; j++) {
                int tmp = matrix[num - 1 - j][i];
                matrix[num - 1 - j][i] = matrix[num - 1 - i][num - 1 - j];
                matrix[num - 1 - i][num - 1 - j] = matrix[j][num - 1 - i];
                matrix[j][num - 1 - i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }

//    public static void rotate(int[][] matrix) {
//        trancepose(matrix);
//        reflect(matrix);
//    }
//
//    private static void trancepose(int[][] matrix) {
//        int num = matrix.length;
//        for (int i = 0; i < num; i++) {
//            for (int j = i + 1; j < num; j++) {
//                int tmp = matrix[j][i];
//                matrix[j][i] = matrix[i][j];
//                matrix[i][j] = tmp;
//            }
//        }
//    }
//
//    private static void reflect(int[][] matrix) {
//        int num = matrix.length;
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num / 2; j++) {
//                int tmp = matrix[i][j];
//                matrix[i][j] = matrix[i][num - 1 - j];
//                matrix[i][num - 1 - j] = tmp;
//            }
//        }
//    }
}
