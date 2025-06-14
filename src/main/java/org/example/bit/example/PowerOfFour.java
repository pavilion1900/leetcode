package org.example.bit.example;

public class PowerOfFour {

//    342. Power of Four
//    Easy
//
//    Given an integer n, return true if it is a power of four. Otherwise, return false.
//
//    An integer n is a power of four, if there exists an integer x such that n == 4x.

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16)); // true
        System.out.println(isPowerOfFour(5));  // false
        System.out.println(isPowerOfFour(1));  // true
    }

//    public static boolean isPowerOfFour(int n) {
//        if (n == 0) {
//            return false;
//        }
//        while (n % 4 == 0) {
//            n /= 4;
//        }
//        return 1 == n;
//    }
//
//    public static boolean isPowerOfFour(int n) {
//        return nums().contains(n);
//    }
//
//    private static Set<Integer> nums() {
//        Set<Integer> rsl = new HashSet<>();
//        int lastNum = 1;
//        rsl.add(lastNum);
//        for (int i = 0; i < 15; i++) {
//            lastNum *= 4;
//            rsl.add(lastNum);
//        }
//        return rsl;
//    }

    public static boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
    }

//    public static boolean isPowerOfFour(int n) {
//        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
//    }
}
