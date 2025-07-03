package org.example.backtracking.example;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

//    22. Generate Parentheses
//    Medium
//
//    Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3)); // ["((()))", "(()())", "(())()", "()(())", "()()()"]
        System.out.println(generateParenthesis(1)); // ["()"]
    }

    public static List<String> generateParenthesis(int n) {
        List<String> rsl = new ArrayList<>();
        backtrack(n, rsl, new StringBuilder(), 0, 0);
        return rsl;
    }

//    Approach 2: Backtracking, Keep Candidate Valid
//    Time complexity  : O(4 в степени n / кв корень из N)
//    Space complexity : O(N)

    private static void backtrack(int n, List<String> rsl, StringBuilder comb, int lCount, int rCount) {
        if (comb.length() == 2 * n) {
            rsl.add(comb.toString());
            return;
        }
        if (lCount < n) {
            comb.append("(");
            backtrack(n, rsl, comb, lCount + 1, rCount);
            comb.deleteCharAt(comb.length() - 1);
        }
        if (lCount > rCount) {
            comb.append(")");
            backtrack(n, rsl, comb, lCount, rCount + 1);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}
