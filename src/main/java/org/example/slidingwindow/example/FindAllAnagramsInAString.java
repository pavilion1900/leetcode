package org.example.slidingwindow.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {

//    438. Find All Anagrams in a String
//    Medium
//
//    Given two strings s and p, return an array of all the start indices of p's anagrams in s.
//    You may return the answer in any order.

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc")); // [0, 6]
        System.out.println(findAnagrams("abab", "ab"));        // [0, 1, 2]
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> rsl = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();
        if (sLen < pLen) {
            return rsl;
        }
        Map<Character, Integer> sChars = new HashMap<>();
        Map<Character, Integer> pChars = new HashMap<>();
        for (Character ch : p.toCharArray()) {
            pChars.put(ch, pChars.getOrDefault(ch, 0) + 1);
        }
        int right = 0;
        while (right < sLen) {
            char chRight = s.charAt(right);
            sChars.put(chRight, sChars.getOrDefault(chRight, 0) + 1);
            if (right >= pLen) {
                char chLeft = s.charAt(right - pLen);
                sChars.put(chLeft, sChars.get(chLeft) - 1);
                if (sChars.get(chLeft) == 0) {
                    sChars.remove(chLeft);
                }
            }
            if (pChars.equals(sChars)) {
                rsl.add(right - pLen + 1);
            }
            right++;
        }
        return rsl;
    }
}
