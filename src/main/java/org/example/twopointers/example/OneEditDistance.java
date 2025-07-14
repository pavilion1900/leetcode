package org.example.twopointers.example;

public class OneEditDistance {

//    161. One Edit Distance
//    Medium
//
//    Given two strings s and t, return true if they are both one edit distance apart, otherwise return false.
//
//    A string s is said to be one distance apart from a string t if you can:
//    - Insert exactly one character into s to get t.
//    - Delete exactly one character from s to get t.
//    - Replace exactly one character of s with a different character to get t.

    public static void main(String[] args) {
        System.out.println(isOneEditDistance("ab", "acb")); // true
        System.out.println(isOneEditDistance("", ""));      // false
        System.out.println(isOneEditDistance("c", "c"));    // false
    }

//    Approach 1: One pass algorithm
//    Time complexity  : O(N)
//    Space complexity : O(N)

    public static boolean isOneEditDistance(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen > tLen) {
            return isOneEditDistance(t, s);
        }
        if (tLen - sLen > 1) {
            return false;
        }
        for (int i = 0; i < sLen; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (sLen == tLen) {
                    return s.substring(i + 1).equals(t.substring(i + 1));
                } else {
                    return s.substring(i).equals(t.substring(i + 1));
                }
            }
        }
        return sLen + 1 == tLen;
    }
}
