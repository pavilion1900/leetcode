package org.example.binarysearch.example;

public class FirstBadVersion {

//    278. First Bad Version
//    Easy
//
//    You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest
//    version of your product fails the quality check. Since each version is developed based on the previous version,
//    all the versions after a bad version are also bad.
//    Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all
//    the following ones to be bad.
//    You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function
//    to find the first bad version. You should minimize the number of calls to the API.

    public static void main(String[] args) {
//        System.out.println(firstBadVersion(1));             // bad = 1
//        System.out.println(firstBadVersion(5));             // bad = 4
        System.out.println(firstBadVersion(2_126_753_390)); // bad = 1_702_766_719
    }

    private static boolean isBadVersion(int version) {
        return 1_702_766_719 <= version;
    }

//    Approach #1 (Linear Scan) [Time Limit Exceeded] [Don't use]
//    Time complexity  : O(N)
//    Space complexity : O(1)
//
//    public static int firstBadVersion(int n) {
//        for (int i = 1; i < n; i++) {
//            if (isBadVersion(i)) {
//                return i;
//            }
//        }
//        return n;
//    }

//    Approach #2 (Binary Search) [Accepted]
//    Time complexity  : O(log N)
//    Space complexity : O(1)

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
