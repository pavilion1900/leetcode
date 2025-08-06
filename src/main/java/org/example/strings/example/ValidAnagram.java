package org.example.strings.example;

public class ValidAnagram {

//    242. Valid Anagram
//    Easy
//
//    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));  // true
        System.out.println(isAnagram("rat", "car"));          // false
    }

//    Approach 2: Frequency Counter
//    Time complexity  : O(n)
//    Space complexity : O(1)

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int num : counter) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
