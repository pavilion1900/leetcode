package org.example.hashtable.task;

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
        return false;
    }
}
