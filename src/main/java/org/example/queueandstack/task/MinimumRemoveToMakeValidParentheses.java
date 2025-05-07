package org.example.queueandstack.task;

public class MinimumRemoveToMakeValidParentheses {

//    1249. Minimum Remove to Make Valid Parentheses
//    Medium
//
//    Given a string s of '(' , ')' and lowercase English characters.
//
//    Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting
//    parentheses string is valid and return any valid string.
//
//    Formally, a parentheses string is valid if and only if:
//
//    It is the empty string, contains only lowercase characters, or
//    It can be written as AB (A concatenated with B), where A and B are valid strings, or
//    It can be written as (A), where A is a valid string.

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("lee(t(c)o)de)")); // lee(t(c)o)de
        System.out.println(minRemoveToMakeValid("a)b(c)d"));       // ab(c)d
        System.out.println(minRemoveToMakeValid("))(("));          // ""
    }

    public static String minRemoveToMakeValid(String s) {
        return null;
    }
}
