package org.example.slidingwindow.example;

import java.util.HashMap;
import java.util.Map;

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
//
//    public static int lengthOfLongestSubstring(String s) {
//        int length = s.length();
//        int maxLength = 0;
//        for (int i = 0; i < length; i++) {
//            for (int j = i; j < length; j++) {
//                if (checkUnique(s, i, j)) {
//                    maxLength = Math.max(maxLength, j - i + 1);
//                }
//            }
//        }
//        return maxLength;
//    }
//
//    private static boolean checkUnique(String s, int start, int end) {
//        Set<Character> set = new HashSet<>();
//        for (int i = start; i <= end; i++) {
//            char ch = s.charAt(i);
//            if (set.contains(ch)) {
//                return false;
//            }
//            set.add(ch);
//        }
//        return true;
//    }
//
//    public static int lengthOfLongestSubstring(String s) {
//        Map<Character, Integer> chars = new HashMap<>();
//        int left = 0;
//        int right = 0;
//        int maxLength = 0;
//        while (right < s.length()) {
//            char ch = s.charAt(right);
//            chars.put(ch, chars.getOrDefault(ch, 0) + 1);
//            while (chars.get(ch) > 1) {
//                char chLeft = s.charAt(left);
//                chars.put(chLeft, chars.get(chLeft) - 1);
//                left++;
//            }
//            maxLength = Math.max(maxLength, right - left + 1);
//            right++;
//        }
//        return maxLength;
//    }
//
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;
        while (right < s.length()) {
            char chRight = s.charAt(right);
            if (chars.containsKey(chRight)) {
                left = Math.max(left, chars.get(chRight));
            }
            maxLen = Math.max(maxLen, right - left + 1);
            chars.put(chRight, right + 1);
            right++;
        }
        return maxLen;
    }
//
//    public static int lengthOfLongestSubstring(String s) {
//        Integer[] chars = new Integer[128];
//        int left = 0;
//        int right = 0;
//        int maxLen = 0;
//        while (right < s.length()) {
//            char ch = s.charAt(right);
//            Integer index = chars[ch];
//            if (index != null && index >= left && index < right) {
//                left = index + 1;
//            }
//            maxLen = Math.max(maxLen, right - left + 1);
//            chars[ch] = right;
//            right++;
//        }
//        return maxLen;
//    }
}
