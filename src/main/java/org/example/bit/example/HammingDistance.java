package org.example.bit.example;

public class HammingDistance {

//    461. Hamming Distance
//    Easy
//
//    The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//
//    Given two integers x and y, return the Hamming distance between them.

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));   // 2
        System.out.println(hammingDistance(3, 1));   // 1
        System.out.println(hammingDistance(128, 8)); // 2
    }

//    Approach 1: Built-in BitCounting Functions
//
//    public static int hammingDistance(int x, int y) {
//        return Integer.bitCount(x ^ y);
//    }
//
//    Approach 2: Bit Shift
//
//    public static int hammingDistance(int x, int y) {
//        int rsl = 0;
//        int xor = x ^ y;
//        while (xor != 0) {
//            if (xor % 2 == 1) {
//                rsl++;
//            }
//            xor >>= 1;
//        }
//        return rsl;
//    }
//
//    public static int hammingDistance(int x, int y) {
//        int rsl = 0;
//        int xor = x ^ y;
//        while (xor != 0) {
//            if ((xor & 1) == 1) {
//                rsl++;
//            }
//            xor >>= 1;
//        }
//        return rsl;
//    }

//    Approach 3: Brian Kernighan's Algorithm

    public static int hammingDistance(int x, int y) {
        int rsl = 0;
        int xor = x ^ y;
        while (xor != 0) {
            xor &= xor - 1;
            rsl++;
        }
        return rsl;
    }
}
