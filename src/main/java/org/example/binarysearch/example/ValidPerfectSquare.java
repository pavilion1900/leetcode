package org.example.binarysearch.example;

public class ValidPerfectSquare {

//        367. Valid Perfect Square
//        Easy
//
//        Given a positive integer num, return true if num is a perfect square or false otherwise.
//        A perfect square is an integer that is the square of an integer. In other words, it is the product of some
//        integer with itself.
//        You must not use any built-in library function, such as sqrt.

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));       // true
        System.out.println(isPerfectSquare(10));      // false
        System.out.println(isPerfectSquare(16));      // true
        System.out.println(isPerfectSquare(808_201)); // true
//        202_051 * 202_051 = 40_824_606_601
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int left = 2;
        int right = num / 2;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            long sqMid = (long) mid * mid;
            if (sqMid == num) {
                return true;
            } else if (sqMid > num) {
                right = --mid;
            } else {
                left = ++mid;
            }
        }
        return false;
    }

//    public static boolean isPerfectSquare(int num) {
//        if (num == 1) {
//            return true;
//        }
//        int left = 2;
//        int right = num;
//        while (right - left > 1) {
//            int mid = (left + right) >>> 1;
//            if (mid <= num / mid) {
//                left = mid;
//            } else {
//                right = mid;
//            }
//        }
//        return (num / left) == left && num % left == 0;
//    }
}
