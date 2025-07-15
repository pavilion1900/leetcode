package org.example.twopointers.example;

public class ValidPalindromeII {

//    680. Valid Palindrome II
//    Easy
//
//    Given a string s, return true if the s can be palindrome after deleting at most one character from it.

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));  // true
        System.out.println(validPalindrome("abca")); // true
        System.out.println(validPalindrome("abc"));  // false
    }

//    Approach: Two Pointers
//    Time complexity  : O(N)
//    Space complexity : O(1)

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return checkPalindrome(s, left, right - 1) || checkPalindrome(s, left + 1, right);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean checkPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
