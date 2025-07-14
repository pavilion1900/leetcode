package org.example.twopointers.task;

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

    public static boolean isOneEditDistance(String s, String t) {
        return false;
    }
}
