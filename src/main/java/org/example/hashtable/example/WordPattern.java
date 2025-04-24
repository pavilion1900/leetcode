package org.example.hashtable.example;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

//        290. Word Pattern
//        Easy
//
//        Given a pattern and a string s, find if s follows the same pattern.
//        Here follow means a full match, such that there is a bijection between a letter in pattern and
//        a non-empty word in s. Specifically:
//        Each letter in pattern maps to exactly one unique word in s.
//        Each unique word in s maps to exactly one letter in pattern.
//        No two letters map to the same word, and no two words map to the same letter.

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));  // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(wordPattern("abba", "dog dog dog dog"));  // false
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));  // false
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length) {
            return false;
        }
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String str = strs[i];
            if (!map1.containsKey(ch) && !map2.containsKey(str)) {
                map1.put(ch, str);
                map2.put(str, ch);
            } else if (map1.containsKey(ch) && !map1.get(ch).equals(str)) {
                return false;
            } else if (map2.containsKey(str) && map2.get(str) != ch) {
                return false;
            }
        }
        return true;
    }
}
