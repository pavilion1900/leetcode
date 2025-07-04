package org.example.backtracking.task;

import java.util.List;

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

    public static List<String> removeInvalidParentheses(String s) {
        return null;
    }
}
