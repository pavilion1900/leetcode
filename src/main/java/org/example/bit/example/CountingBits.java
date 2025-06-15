package org.example.bit.example;

import java.util.Arrays;

public class CountingBits {

//    338. Counting Bits
//    Easy
//
//    Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is
//    the number of 1's in the binary representation of i.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2))); // [0, 1, 1]
        System.out.println(Arrays.toString(countBits(5))); // [0, 1, 1, 2, 1, 2]
    }

//    Approach 1: Pop Count (Don't use)
//
//    public static int[] countBits(int n) {
//        int[] ans = new int[n + 1];
//        for (int x = 0; x <= n; ++x) {
//            ans[x] = popCount(x);
//        }
//        return ans;
//    }
//
//    private static int popCount(int x) {
//        int count;
//        for (count = 0; x != 0; ++count) {
//            x &= x - 1;
//        }
//        return count;
//    }
//
//    Approach 2: DP + Most Significant Bit
//
//    public static int[] countBits(int n) {
//        int[] ans = new int[n + 1];
//        int x = 0;
//        int b = 1;
//        while (b <= n) {
//            while (x < b && x + b <= n) {
//                ans[x + b] = ans[x] + 1;
//                ++x;
//            }
//            x = 0;
//            b <<= 1;
//        }
//        return ans;
//    }
//
//    Approach 3: DP + Least Significant Bit (Use)

    public static int[] countBits(int n) {
        int[] rsl = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            rsl[i] = rsl[i >> 1] + (i & 1);
        }
        return rsl;
    }

//    Approach 4: DP + Last Set Bit (Use)
//
//    public static int[] countBits(int num) {
//        int[] rsl = new int[num + 1];
//        for (int i = 1; i <= num; i++) {
//            rsl[i] = rsl[i & (i - 1)] + 1;
//        }
//        return rsl;
//    }
}
