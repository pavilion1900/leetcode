package org.example.slidingwindow.task;

public class MinimumWindowSubstring {

//    76. Minimum Window Substring
//    Hard
//
//    Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such
//    that every character in t (including duplicates) is included in the window. If there is no such substring,
//    return the empty string "".
//
//    The testcases will be generated such that the answer is unique.

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC")); // "BANC"
        System.out.println(minWindow("a", "a"));               // "a"
        System.out.println(minWindow("a", "aa"));              // ""
    }

    public static String minWindow(String s, String t) {
        return null;
    }
}
