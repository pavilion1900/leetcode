package org.example.strings.example;

import java.util.Arrays;

public class ReverseString {

//        344. Reverse String
//        Easy
//
//        Write a function that reverses a string. The input string is given as an array of characters s.
//        You must do this by modifying the input array in-place with O(1) extra memory.

    public static void main(String[] args) {
        char[] array1 = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] array2 = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(array1);
        reverseString(array2);
        System.out.println(Arrays.toString(array1)); // ['o', 'l', 'l', 'e', 'h']
        System.out.println(Arrays.toString(array2)); // ['h', 'a', 'n', 'n', 'a', 'H']
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
