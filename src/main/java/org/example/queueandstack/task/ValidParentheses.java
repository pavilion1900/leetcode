package org.example.queueandstack.task;

public class ValidParentheses {

//        20. Valid Parentheses
//        Easy
//
//        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
//        determine if the input string is valid.
//
//        An input string is valid if:
//        1. Open brackets must be closed by the same type of brackets.
//        2. Open brackets must be closed in the correct order.
//        3. Every close bracket has a corresponding open bracket of the same type.

    public static void main(String[] args) {
        System.out.println(isValid("()"));     // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]"));     // false
        System.out.println(isValid("([])"));   // true
    }

    public static boolean isValid(String s) {
        return false;
    }
}
