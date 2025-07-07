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

    public static List<Integer> partitionLabels(String s) {
        int[] lastPosition = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            lastPosition[ch - 'a'] = i;
        }
        int pStart = 0;
        int pEnd = 0;
        List<Integer> pSize = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int position = lastPosition[ch - 'a'];
            pEnd = Math.max(pEnd, position);
            if (i == pEnd) {
                pSize.add(i - pStart + 1);
                pStart = i + 1;
            }
        }
        return pSize;
    }
}
