package org.example.twopointers.task;

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

    public static int maxDistToClosest(int[] seats) {
        return -1;
    }
}
