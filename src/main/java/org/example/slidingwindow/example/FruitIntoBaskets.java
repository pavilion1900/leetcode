package org.example.slidingwindow.example;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {

//    904. Fruit Into Baskets
//    Medium
//
//    You are visiting a farm that has a single row of fruit trees arranged from left to right.
//    The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
//
//    You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
//
//    - You only have two baskets, and each basket can only hold a single type of fruit.
//    There is no limit on the amount of fruit each basket can hold.
//    - Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree)
//    while moving to the right. The picked fruits must fit in one of your baskets.
//    - Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
//
//    Given the integer array fruits, return the maximum number of fruits you can pick.

    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{1, 2, 1}));       // 3
        System.out.println(totalFruit(new int[]{0, 1, 2, 2}));    // 3
        System.out.println(totalFruit(new int[]{1, 2, 3, 2, 2})); // 4
    }

//    public static int totalFruit(int[] fruits) {
//        int left = 0;
//        int right = 0;
//        Map<Integer, Integer> basket = new HashMap<>();
//        while (right < fruits.length) {
//            int frRight = fruits[right];
//            basket.put(frRight, basket.getOrDefault(frRight, 0) + 1);
//            if (basket.size() > 2) {
//                int frLeft = fruits[left];
//                basket.put(frLeft, basket.get(frLeft) - 1);
//                if (basket.get(frLeft) == 0) {
//                    basket.remove(frLeft);
//                }
//                left++;
//            }
//            right++;
//        }
//        return right - left;
//    }

    public static int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        Map<Integer, Integer> basket = new HashMap<>();
        while (right < fruits.length) {
            int frRight = fruits[right];
            basket.put(frRight, basket.getOrDefault(frRight, 0) + 1);
            while (basket.size() > 2) {
                int frLeft = fruits[left];
                basket.put(frLeft, basket.get(frLeft) - 1);
                if (basket.get(frLeft) == 0) {
                    basket.remove(frLeft);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
