package org.example.backtracking.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveInvalidParentheses {

//    301. Remove Invalid Parentheses
//    Hard
//
//    Given a string s that contains parentheses and letters, remove the minimum number of invalid parentheses
//    to make the input string valid.
//
//    Return a list of unique strings that are valid with the minimum number of removals.
//    You may return the answer in any order.

    public static void main(String[] args) {
        System.out.println(removeInvalidParentheses("()())()"));  // [()()(), (())()]
        System.out.println(removeInvalidParentheses("(a)())()")); // [(a)()(), (a())()]
        System.out.println(removeInvalidParentheses(")("));       // []
    }

//    Approach 1: Backtracking
//    Time complexity  : O(2 в степени N)
//    Space complexity : O(N)

    private static final Set<String> validSet = new HashSet<>();
    private static int minRemoved;

    private static void reset() {
        validSet.clear();
        minRemoved = Integer.MAX_VALUE;
    }

    public static List<String> removeInvalidParentheses(String s) {
        reset();
        backtrack(s, 0, 0, 0, new StringBuilder(), 0);
        return new ArrayList<>(validSet);
    }

    private static void backtrack(String s, int index, int lCount, int rCount, StringBuilder comb, int removedCount) {
        if (index == s.length()) {
            if (lCount == rCount) {
                if (removedCount <= minRemoved) {
                    String str = comb.toString();
                    if (removedCount < minRemoved) {
                        validSet.clear();
                        minRemoved = removedCount;
                    }
                    validSet.add(str);
                }
            }
        } else {
            char ch = s.charAt(index);
            int combLen = comb.length();
            if (ch != '(' && ch != ')') {
                comb.append(ch);
                backtrack(s, index + 1, lCount, rCount, comb, removedCount);
                comb.deleteCharAt(combLen);
            } else {
                backtrack(s, index + 1, lCount, rCount, comb, removedCount + 1);
                comb.append(ch);
                if (ch == '(') {
                    backtrack(s, index + 1, lCount + 1, rCount, comb, removedCount);
                } else if (lCount > rCount) {
                    backtrack(s, index + 1, lCount, rCount + 1, comb, removedCount);
                }
                comb.deleteCharAt(combLen);
            }
        }
    }
}
