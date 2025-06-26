package org.example.slidingwindow.example;

public class CountSubstringsWithoutRepeatingCharacter {

//    2743. Count Substrings Without Repeating Character
//    Medium
//
//    You are given a string s consisting only of lowercase English letters. We call a substring special if it
//    contains no character which has occurred at least twice (in other words, it does not contain a repeating
//    character). Your task is to count the number of special substrings. For example, in the string "pop",
//    the substring "po" is a special substring, however, "pop" is not special (since 'p' has occurred twice).
//
//    Return the number of special substrings.
//    A substring is a contiguous sequence of characters within a string. For example, "abc" is a substring of "abcd",
//    but "acd" is not.

    public static void main(String[] args) {
        System.out.println(numberOfSpecialSubstrings("abcd")); // 10
        System.out.println(numberOfSpecialSubstrings("ooo"));  // 3
        System.out.println(numberOfSpecialSubstrings("abab")); // 7
    }

    public static int numberOfSpecialSubstrings(String s) {
        int left = 0;
        int right = 0;
        int substrLen = 0;
        int[] chars = new int[26];
        while (right < s.length()) {
            chars[s.charAt(right) - 'a']++;
            while (chars[s.charAt(right) - 'a'] > 1) {
                chars[s.charAt(left) - 'a']--;
                left++;
            }
            substrLen += right - left + 1;
            right++;
        }
        return substrLen;
    }
}
