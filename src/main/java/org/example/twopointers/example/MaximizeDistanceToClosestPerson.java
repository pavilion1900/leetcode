package org.example.twopointers.example;

public class MaximizeDistanceToClosestPerson {

//    849. Maximize Distance to Closest Person
//    Medium
//
//    You are given an array representing a row of seats where seats[i] = 1 represents a person sitting in the ith seat,
//    and seats[i] = 0 represents that the ith seat is empty (0-indexed).
//
//    There is at least one empty seat, and at least one person sitting.
//
//    Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.
//
//    Return that maximum distance to the closest person.

    public static void main(String[] args) {
        System.out.println(maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1})); // 2
        System.out.println(maxDistToClosest(new int[]{1, 0, 0, 0}));          // 3
        System.out.println(maxDistToClosest(new int[]{0, 1}));                // 1
    }

//    Approach #2: Two Pointer
//    Time complexity  : O(N)
//    Space complexity : O(1)

    public static int maxDistToClosest(int[] seats) {
        int arrLen = seats.length;
        int prev = -1;
        int future = 0;
        int maxDis = 0;
        for (int i = 0; i < arrLen; i++) {
            if (seats[i] == 1) {
                prev = i;
            } else {
                while (future < arrLen && seats[future] == 0 || future < i) {
                    future++;
                }
                int left = prev == -1 ? arrLen : i - prev;
                int right = future == arrLen ? arrLen : future - i;
                maxDis = Math.max(maxDis, Math.min(left, right));
            }
        }
        return maxDis;
    }
}
