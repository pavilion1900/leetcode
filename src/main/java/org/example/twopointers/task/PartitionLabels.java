package org.example.twopointers.task;

import java.util.List;

public class PartitionLabels {

//        763. Partition Labels
//        Medium
//
//        You are given a string s. We want to partition the string into as many parts as possible so that each
//        letter appears in at most one part. For example, the string "ababcc" can be partitioned into ["abab", "cc"],
//        but partitions such as ["aba", "bcc"] or ["ab", "ab", "cc"] are invalid.
//        Note that the partition is done so that after concatenating all the parts in order, the resultant string
//        should be s.
//        Return a list of integers representing the size of these parts.

    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij")); // [9, 7, 8]
        System.out.println(partitionLabels("eccbbbbdec"));               // [10]
    }

    public static List<Integer> partitionLabels(String s) {
        return null;
    }
}
