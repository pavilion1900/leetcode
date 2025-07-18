package org.example.twopointers.example;

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

//    Approach 2: Two-Pointers
//    Time complexity  : O(N)
//    Space complexity : O(1)

    public static boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int p1 = 0;
        int p2 = 0;
        while (p1 < sLen && p2 < tLen) {
            char ch1 = s.charAt(p1);
            char ch2 = t.charAt(p2);
            if (ch1 == ch2) {
                p1++;
            }
            p2++;
        }
        return p1 == sLen;
    }
}
