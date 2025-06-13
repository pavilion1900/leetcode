package org.example.bit.example;

public class PowerOfTwo {

//    231. Power of Two
//    Easy
//
//    Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//    An integer n is a power of two, if there exists an integer x such that n == 2x.

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));            // true
        System.out.println(isPowerOfTwo(16));           // true
        System.out.println(isPowerOfTwo(3));            // false
        System.out.println(isPowerOfTwo(-2147483648));  // false
    }

//    public static boolean isPowerOfTwo(int n) {
//        if (n == 0) {
//            return false;
//        }
//        while (n % 2 == 0) {
//            n /= 2;
//        }
//        return 1 == n;
//    }

//    public static boolean isPowerOfTwo(int n) {
//        if (n <= 0) {
//            return false;
//        }
//        return (n & (-n)) == n;
//    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
