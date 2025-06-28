package org.example.binarysearch.example;

public class Sqrt {

//    69. Sqrt(x)
//    Easy
//
//    Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
//    The returned integer should be non-negative as well.
//    You must not use any built-in exponent function or operator.

    public static void main(String[] args) {
        System.out.println(mySqrt(0));  // 0
        System.out.println(mySqrt(2));  // 1
        System.out.println(mySqrt(4));  // 2
        System.out.println(mySqrt(8));  // 2
    }

//    Approach 2: Binary Search
//    Time complexity  : O(log N)
//    Space complexity : O(1)

    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 2;
        int right = x >>> 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            long sqMid = (long) mid * mid;
            if (sqMid == x) {
                return mid;
            } else if (sqMid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
