package org.example.slidingwindow.example;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

//    424. Longest Repeating Character Replacement
//    Medium
//
//    You are given a string s and an integer k. You can choose any character of the string and change it to any
//    other uppercase English character. You can perform this operation at most k times.
//
//    Return the length of the longest substring containing the same letter you can get after performing
//    the above operations.

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));    // 4
        System.out.println(characterReplacement("AABABBA", 1)); // 4
    }

//    public static int characterReplacement(String s, int k) {
//        int left = 1;
//        int right = s.length() + 1;
//        while (left + 1 < right) {
//            int mid = (left + right) >>> 1;
//            if (validLength(s, mid, k)) {
//                left = mid;
//            } else {
//                right = mid;
//            }
//        }
//        return left;
//    }
//
//    private static boolean validLength(String s, int substrLen, int k) {
//        Map<Character, Integer> chars = new HashMap<>();
//        int left = 0;
//        int right = 0;
//        int maxFreq = 0;
//        while (right < s.length()) {
//            char ch = s.charAt(right);
//            chars.put(ch, chars.getOrDefault(ch, 0) + 1);
//            if (right - left + 1 > substrLen) {
//                char chLeft = s.charAt(left);
//                chars.put(chLeft, chars.get(chLeft) - 1);
//                left++;
//            }
//            maxFreq = Math.max(maxFreq, chars.get(ch));
//            if (substrLen - maxFreq <= k) {
//                return true;
//            }
//            right++;
//        }
//        return false;
//    }
//
//    public static int characterReplacement(String s, int k) {
//        Set<Character> chars = new HashSet<>();
//        for (int i = 0; i < s.length(); i++) {
//            chars.add(s.charAt(i));
//        }
//        int maxLen = 0;
//        for (Character ch : chars) {
//            int left = 0;
//            int right = 0;
//            int count = 0;
//            while (right < s.length()) {
//                char chRight = s.charAt(right);
//                if (ch == chRight) {
//                    count++;
//                }
//                while (!isValidWindow(left, right, count, k)) {
//                    char chLeft = s.charAt(left);
//                    if (ch == chLeft) {
//                        count--;
//                    }
//                    left++;
//                }
//                maxLen = Math.max(maxLen, right - left + 1);
//                right++;
//            }
//        }
//        return maxLen;
//    }
//
//    private static boolean isValidWindow(int left, int right, int count, int k) {
//        return right - left + 1 - count <= k;
//    }

    public static int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int maxLen = 0;
        Map<Character, Integer> chars = new HashMap<>();
        while (right < s.length()) {
            char chRight = s.charAt(right);
            chars.put(chRight, chars.getOrDefault(chRight, 0) + 1);
            maxFreq = Math.max(maxFreq, chars.get(chRight));
            boolean isValidWindow = right - left + 1 - maxFreq <= k;
            if (!isValidWindow) {
                char chLeft = s.charAt(left);
                chars.put(chLeft, chars.get(chLeft) - 1);
                left++;
            }
            maxLen = right - left + 1;
            right++;
        }
        return maxLen;
    }
}
