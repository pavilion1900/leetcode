package org.example.slidingwindow.task;

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
        return false;
    }
}
