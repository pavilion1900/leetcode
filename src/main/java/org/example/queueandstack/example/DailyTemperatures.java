package org.example.queueandstack.example;

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

//    public static int[] dailyTemperatures(int[] temperatures) {
//        int length = temperatures.length;
//        int[] result = new int[length];
//        Stack<Integer> stack = new Stack<>();
//        for (int currDay = 0; currDay < length; currDay++) {
//            int currTemp = temperatures[currDay];
//            while (!stack.isEmpty() && currTemp > temperatures[stack.peek()]) {
//                int prevDay = stack.pop();
//                result[prevDay] = currDay - prevDay;
//            }
//            stack.push(currDay);
//        }
//        return result;
//    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] rsl = new int[len];
        int hottest = 0;
        for (int currDay = len - 1; currDay >= 0; currDay--) {
            int currTemp = temperatures[currDay];
            if (currTemp >= hottest) {
                hottest = currTemp;
                continue;
            }
            int days = 1;
            while (currTemp >= temperatures[currDay + days]) {
                days += rsl[currDay + days];
            }
            rsl[currDay] = days;
        }
        return rsl;
    }
}
