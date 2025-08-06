package org.example.strings.example;

public class LongestCommonPrefix {

//    14. Longest Common Prefix
//    Easy
//
//    Write a function to find the longest common prefix string amongst an array of strings.
//    If there is no common prefix, return an empty string "".

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));  // "fl"
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));     // ""
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));                   // "a"
        System.out.println(longestCommonPrefix(new String[]{}));                            // ""
    }

//    Approach 2: Vertical scanning
//    Time complexity  : O(m * n)
//    Space complexity : O(1)

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

//    Approach
//    Time complexity  : O(n * log(n) + min(m, n))
//    Space complexity : O(n)
//
//    public static String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) {
//            return "";
//        }
//        Arrays.sort(strs);
//        String left = strs[0];
//        String right = strs[strs.length - 1];
//        int index = 0;
//        while (index < left.length()) {
//            if (left.charAt(index) != right.charAt(index)) {
//                return left.substring(0, index);
//            }
//            index++;
//        }
//        return left;
//    }
}
