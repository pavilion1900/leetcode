package org.example.slidingwindow.example;

import java.util.HashMap;
import java.util.Map;

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
        int sLen = s.length();
        int tLen = t.length();
        if (sLen == 0 || tLen == 0) {
            return "";
        }
        int left = 0;
        int right = 0;
        Map<Character, Integer> sChars = new HashMap<>();
        Map<Character, Integer> tChars = new HashMap<>();
        int sUniqueChars = 0;
        int tUniqueChars = 0;
        int[] rsl = new int[]{-1, 0, 0};

        for (int i = 0; i < tLen; i++) {
            char ch = t.charAt(i);
            tChars.put(ch, tChars.getOrDefault(ch, 0) + 1);
        }
        tUniqueChars = tChars.size();

        while (right < sLen) {
            char chRight = s.charAt(right);
            sChars.put(chRight, sChars.getOrDefault(chRight, 0) + 1);
            if (tChars.containsKey(chRight)
                    && tChars.get(chRight).intValue() == sChars.get(chRight).intValue()) {
                sUniqueChars++;
            }
            while (left <= right && tUniqueChars == sUniqueChars) {
                if (rsl[0] == -1 || right - left + 1 < rsl[0]) {
                    rsl[0] = right - left + 1;
                    rsl[1] = left;
                    rsl[2] = right;
                }
                char chLeft = s.charAt(left);
                sChars.put(chLeft, sChars.get(chLeft) - 1);
                if (tChars.containsKey(chLeft) && sChars.get(chLeft) < tChars.get(chLeft)) {
                    sUniqueChars--;
                }
                left++;
            }
            right++;
        }
        return rsl[0] == -1 ? "" : s.substring(rsl[1], rsl[2] + 1);
    }
}
