package org.example.hashtable.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];
        for (String str : strs) {
            Arrays.fill(count, 0);
            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append('#');
                sb.append(num);
            }
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
