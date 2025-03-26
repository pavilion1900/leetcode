package org.example.binarysearch.task;

public class FirstBadVersion {

    public static void main(String[] args) {
//        278. First Bad Version
//        Easy
//
//        You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest
//        version of your product fails the quality check. Since each version is developed based on the previous version,
//        all the versions after a bad version are also bad.
//        Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all
//        the following ones to be bad.
//        You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function
//        to find the first bad version. You should minimize the number of calls to the API.

//        System.out.println(firstBadVersion(1));             // bad = 1
//        System.out.println(firstBadVersion(5));             // bad = 4
        System.out.println(firstBadVersion(2_126_753_390)); // bad = 1_702_766_719
    }

    public static int firstBadVersion(int n) {
        return -1;
    }

    static boolean isBadVersion(int version) {
        return 1_702_766_719 <= version;
    }
}
