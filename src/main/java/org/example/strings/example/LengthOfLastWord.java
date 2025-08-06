package org.example.strings.example;

public class LengthOfLastWord {

//    58. Length of Last Word
//    Easy
//
//    Given a string s consisting of words and spaces, return the length of the last word in the string.
//    A word is a maximal substring consisting of non-space characters only.

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));                 // 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(lengthOfLastWord("luffy is still joyboy"));       // 6
        System.out.println(lengthOfLastWord("boy  "));                       // 3
    }

//    Approach 1: String Index Manipulation
//    Time complexity  : O(n)
//    Space complexity : O(1)

    public static int lengthOfLastWord(String s) {
        int length = 0;
        int right = s.length() - 1;
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }
        while (right >= 0 && s.charAt(right) != ' ') {
            length++;
            right--;
        }
        return length;
    }
}
