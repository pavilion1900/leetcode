package org.example.slidingwindow.task;

public class LongestSubstringWithoutRepeatingCharacters {

//    3. Longest Substring Without Repeating Characters
//    Medium
//
//    Given a string s, find the length of the longest substring without duplicate characters.

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(lengthOfLongestSubstring(" "));        // 1
        System.out.println(lengthOfLongestSubstring("au"));       // 2
        System.out.println(lengthOfLongestSubstring("aab"));      // 2
        System.out.println(lengthOfLongestSubstring("dvdf"));     // 3
        System.out.println(lengthOfLongestSubstring("abba"));     // 2
    }

    public static int lengthOfLongestSubstring(String s) {
        return -1;
    }
}
