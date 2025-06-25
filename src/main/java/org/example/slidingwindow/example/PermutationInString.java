package org.example.slidingwindow.example;

public class PermutationInString {

//    567. Permutation in String
//    Medium
//
//    Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
//    In other words, return true if one of s1's permutations is the substring of s2.

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo")); // true
        System.out.println(checkInclusion("ab", "eidboaoo")); // false
    }

    public static boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        if (s1Len > s2Len) {
            return false;
        }
        int[] s1arr = new int[26];
        int[] s2arr = new int[26];
        for (int i = 0; i < s1Len; i++) {
            s1arr[s1.charAt(i) - 'a']++;
            s2arr[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2Len - s1Len; i++) {
            if (matches(s1arr, s2arr)) {
                return true;
            }
            s2arr[s2.charAt(i + s1Len) - 'a']++;
            s2arr[s2.charAt(i) - 'a']--;
        }
        return matches(s1arr, s2arr);
    }

    private static boolean matches(int[] s1arr, int[] s2arr) {
        for (int i = 0; i < 26; i++) {
            if (s1arr[i] != s2arr[i]) {
                return false;
            }
        }
        return true;
    }
}
