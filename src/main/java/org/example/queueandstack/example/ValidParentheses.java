package org.example.queueandstack.example;

import java.util.Stack;

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
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('(' == ch || '[' == ch || '{' == ch) {
                stack.push(ch);
            } else if (!stack.isEmpty() && ')' == ch && stack.peek() == '(') {
                stack.pop();
            } else if (!stack.isEmpty() && ']' == ch && stack.peek() == '[') {
                stack.pop();
            } else if (!stack.isEmpty() && '}' == ch && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

//    public static boolean isValid(String s) {
//        if (s.length() % 2 != 0) {
//            return false;
//        }
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if ('(' == ch) {
//                stack.push(')');
//            } else if ('[' == ch) {
//                stack.push(']');
//            } else if ('{' == ch) {
//                stack.push('}');
//            } else {
//                if (stack.isEmpty() || stack.pop() != ch) {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
}
