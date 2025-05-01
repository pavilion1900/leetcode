package org.example.math.example;

public class PalindromeNumber {

//    9. Palindrome Number
//    Easy
//
//    Given an integer x, return true if x is a palindrome, and false otherwise.

    public static void main(String[] args) {
        System.out.println(isPalindrome(-100));  // false
        System.out.println(isPalindrome(1));     // true
        System.out.println(isPalindrome(10));    // false
        System.out.println(isPalindrome(121));   // true
        System.out.println(isPalindrome(1211));  // false
    }

//    public static boolean isPalindrome(int x) {
//        String number = String.valueOf(x);
//        String reverse = new StringBuilder(number).reverse().toString();
//        return number.equals(reverse);
//    }
//
//    public static boolean isPalindrome(int x) {
//        String number = String.valueOf(x);
//        int left = 0;
//        int right = number.length() - 1;
//        while (left < right) {
//            if (number.charAt(left) != number.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int original = x;
        int revertedNum = 0;
        while (x > 0) {
            revertedNum = revertedNum * 10 + x % 10;
            x /= 10;
        }
        return original == revertedNum;
    }
}
