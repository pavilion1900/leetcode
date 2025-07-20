package org.example.twopointers.example;

public class LongestPalindromicSubstring {

//    5. Longest Palindromic Substring
//    Medium
//
//    Given a string s, return the longest palindromic substring in s.

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // bab
        System.out.println(longestPalindrome("cbbd"));  // bb
    }

//    Approach 3: Expand From Centers
//    Time complexity  : O(n * n)
//    Space complexity : O(1)

    public static String longestPalindrome(String s) {
        int[] rsl = new int[]{0, 0};
        for (int i = 0; i < s.length(); i++) {
            int oddLen = expand(i, i, s);
            if (oddLen > rsl[1] - rsl[0] + 1) {
                int dist = oddLen >>> 1;
                rsl[0] = i - dist;
                rsl[1] = i + dist;
            }

            int evenLen = expand(i, i + 1, s);
            if (evenLen > rsl[1] - rsl[0] + 1) {
                int dist = (evenLen >>> 1) - 1;
                rsl[0] = i - dist;
                rsl[1] = i + dist + 1;
            }
        }
        return s.substring(rsl[0], rsl[1] + 1);
    }

    private static int expand(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
