package org.example.twopointers.task;

public class IsSubsequence {

//    392. Is Subsequence
//    Easy
//
//    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//    A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
//    of the characters without disturbing the relative positions of the remaining characters.
//    (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")); // true
        System.out.println(isSubsequence("axc", "ahbgdc")); // false
        System.out.println(isSubsequence("", "ahbgdc"));    // true
    }

    public static boolean isSubsequence(String s, String t) {
        return false;
    }
}
