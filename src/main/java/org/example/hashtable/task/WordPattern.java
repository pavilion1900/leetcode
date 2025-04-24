package org.example.hashtable.task;

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
        return false;
    }
}
