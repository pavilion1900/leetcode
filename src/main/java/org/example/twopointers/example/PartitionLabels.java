package org.example.twopointers.example;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

//    763. Partition Labels
//    Medium
//
//    You are given a string s. We want to partition the string into as many parts as possible so that each
//    letter appears in at most one part. For example, the string "ababcc" can be partitioned into ["abab", "cc"],
//    but partitions such as ["aba", "bcc"] or ["ab", "ab", "cc"] are invalid.
//    Note that the partition is done so that after concatenating all the parts in order, the resultant string
//    should be s.
//    Return a list of integers representing the size of these parts.

    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij")); // [9, 7, 8]
        System.out.println(partitionLabels("eccbbbbdec"));               // [10]
    }

//    Approach 1: Two Pointers
//    Time complexity  : O(N)
//    Space complexity : O(1)

    public static List<Integer> partitionLabels(String s) {
        int[] lastPositions = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            lastPositions[ch - 'a'] = i;
        }
        int start = 0;
        int end = 0;
        List<Integer> sizes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int lastPosition = lastPositions[ch - 'a'];
            end = Math.max(end, lastPosition);
            if (i == end) {
                sizes.add(i - start + 1);
                start = i + 1;
            }
        }
        return sizes;
    }
}
