package org.example.queueandstack.example;

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

//    public static String minRemoveToMakeValid(String s) {
//        Set<Integer> setToRemove = new HashSet<>();
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                stack.push(i);
//            } else if (s.charAt(i) == ')') {
//                if (!stack.isEmpty()) {
//                    stack.pop();
//                } else {
//                    setToRemove.add(i);
//                }
//            }
//        }
//        while (!stack.isEmpty()) {
//            setToRemove.add(stack.pop());
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (!setToRemove.contains(i)) {
//                sb.append(s.charAt(i));
//            }
//        }
//        return sb.toString();
//    }

    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int allOpenPar = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                allOpenPar++;
                balance++;
            } else if (ch == ')') {
                if (balance == 0) {
                    continue;
                }
                balance--;
            }
            sb.append(ch);
        }
        StringBuilder rsl = new StringBuilder();
        int rightOpenPar = allOpenPar - balance;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                rightOpenPar--;
                if (rightOpenPar < 0) {
                    continue;
                }
            }
            rsl.append(ch);
        }
        return rsl.toString();
    }
}
