package org.example.hashtable.task;

import java.util.List;

public class GroupAnagrams {

//        49. Group Anagrams
//        Medium
//
//        Given an array of strings strs, group the anagrams together. You can return the answer in any order.

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})); // [["bat"],["nat","tan"],["ate","eat","tea"]]
        System.out.println(groupAnagrams(new String[]{""}));                                       // [[""]]
        System.out.println(groupAnagrams(new String[]{"a"}));                                      // [["a"]]
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        return null;
    }
}
