package org.example.twopointers.task;

public class StringCompression {

//    443. String Compression
//    Medium
//
//    Given an array of characters chars, compress it using the following algorithm:
//
//    Begin with an empty string s. For each group of consecutive repeating characters in chars:
//
//    - If the group's length is 1, append the character to s.
//    - Otherwise, append the character followed by the group's length.
//    The compressed string s should not be returned separately, but instead, be stored in the input character
//    array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
//
//    After you are done modifying the input array, return the new length of the array.
//
//    You must write an algorithm that uses only constant extra space.

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));                               // 6
        System.out.println(compress(new char[]{'a'}));                                                             // 1
        System.out.println(compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'})); // 4
    }

    public static int compress(char[] chars) {
        return -1;
    }
}
