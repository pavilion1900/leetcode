package org.example.twopointers.example;

import java.util.ArrayList;
import java.util.List;

public class ProductOfTwoRunLengthEncodedArrays {

//    1868. Product of Two Run-Length Encoded Arrays
//    Medium
//
//    Run-length encoding is a compression algorithm that allows for an integer array nums with many segments
//    of consecutive repeated numbers to be represented by a (generally smaller) 2D array encoded.
//    Each encoded[i] = [vali, freqi] describes the ith segment of repeated numbers in nums where vali is the value
//    that is repeated freqi times.
//
//    For example, nums = [1,1,1,2,2,2,2,2] is represented by the run-length encoded array encoded = [[1,3],[2,5]].
//    Another way to read this is "three 1's followed by five 2's".
//    The product of two run-length encoded arrays encoded1 and encoded2 can be calculated using the following steps:
//
//    Expand both encoded1 and encoded2 into the full arrays nums1 and nums2 respectively.
//    Create a new array prodNums of length nums1.length and set prodNums[i] = nums1[i] * nums2[i].
//    Compress prodNums into a run-length encoded array and return it.
//    You are given two run-length encoded arrays encoded1 and encoded2 representing full arrays nums1 and
//    nums2 respectively. Both nums1 and nums2 have the same length. Each encoded1[i] = [vali, freqi] describes
//    the ith segment of nums1, and each encoded2[j] = [valj, freqj] describes the jth segment of nums2.
//
//    Return the product of encoded1 and encoded2.
//
//    Note: Compression should be done such that the run-length encoded array has the minimum possible length.

    public static void main(String[] args) {
        System.out.println(findRLEArray(new int[][]{{1, 3}, {2, 3}}, new int[][]{{6, 3}, {3, 3}}));         // [[6, 6]]
        System.out.println(findRLEArray(new int[][]{{1, 3}, {2, 1}, {3, 2}}, new int[][]{{2, 3}, {3, 3}})); // [[2, 3], [6, 1], [9, 2]]
        System.out.println(findRLEArray(
                new int[][]{{2, 2}, {5, 5}, {1, 5}, {2, 5}, {4, 2}, {5, 3}, {1, 2}, {4, 3}, {3, 2}, {2, 3}},
                new int[][]{{1, 1}, {4, 1}, {3, 3}, {5, 3}, {1, 4}, {5, 1}, {4, 1}, {5, 3}, {3, 5}, {2, 1}, {1, 2}, {3, 1}, {2, 1}, {4, 3}, {3, 1}, {2, 1}}));
        // [[2,1],[8,1],[15,3],[25,2],[5,1],[1,4],[10,1],[8,1],[10,3],[12,2],[15,3],[2,1],[1,1],[4,1],[12,1],[8,1],[12,2],[8,1],[6,1],[4,1]]
    }

    public static List<List<Integer>> findRLEArray(int[][] encoded1, int[][] encoded2) {
        List<List<Integer>> rsl = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < encoded1.length && p2 < encoded2.length) {
            int val1 = encoded1[p1][0];
            int freq1 = encoded1[p1][1];
            int val2 = encoded2[p2][0];
            int freq2 = encoded2[p2][1];

            int val = val1 * val2;
            int minFreq = Math.min(freq1, freq2);

            if (!rsl.isEmpty() && rsl.get(rsl.size() - 1).get(0) == val) {
                List<Integer> list = rsl.get(rsl.size() - 1);
                list.set(1, list.get(1) + minFreq);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(val);
                list.add(minFreq);
                rsl.add(list);
            }

            encoded1[p1][1] -= minFreq;
            encoded2[p2][1] -= minFreq;

            if (encoded1[p1][1] == 0) {
                p1++;
            }
            if (encoded2[p2][1] == 0) {
                p2++;
            }
        }
        return rsl;
    }
}
