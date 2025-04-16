package org.example.strings.example;

public class ValidPalindrome {

//        125. Valid Palindrome
//        Easy
//
//        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
//        all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include
//        letters and numbers.
//        Given a string s, return true if it is a palindrome, or false otherwise.

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car"));                     // false
        System.out.println(isPalindrome(" "));                              // true
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
