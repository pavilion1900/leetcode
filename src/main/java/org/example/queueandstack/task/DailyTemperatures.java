package org.example.queueandstack.task;

import java.util.Arrays;

public class DailyTemperatures {

//        739. Daily Temperatures
//        Medium
//
//        Given an array of integers temperatures represents the daily temperatures, return an array answer such
//        that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
//        If there is no future day for which this is possible, keep answer[i] == 0 instead.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}))); // [1, 1, 4, 2, 1, 1, 0, 0]
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 40, 50, 60})));                 // [1, 1, 1, 0]
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 60, 90})));                     // [1, 1, 0]
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        return null;
    }
}
