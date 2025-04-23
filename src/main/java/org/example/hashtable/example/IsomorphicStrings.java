package org.example.hashtable.example;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

//        205. Isomorphic Strings
//        Easy
//
//        Given two strings s and t, determine if they are isomorphic.
//        Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//        All occurrences of a character must be replaced with another character while preserving the order of characters.
//        No two characters may map to the same character, but a character may map to itself.

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));           // true
        System.out.println(isIsomorphic("foo", "bar"));           // false
        System.out.println(isIsomorphic("paper", "title"));       // true
        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba")); // false
        System.out.println(isIsomorphic("badc", "baba"));         // false
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (!map1.containsKey(ch1) && !map2.containsKey(ch2)) {
                map1.put(ch1, ch2);
                map2.put(ch2, ch1);
            } else if (map1.containsKey(ch1) && map1.get(ch1) != ch2) {
                return false;
            } else if (map2.containsKey(ch2) && map2.get(ch2) != ch1) {
                return false;
            }
        }
        return true;
    }
}
