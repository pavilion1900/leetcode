package org.example.strings.example;

import java.util.Map;

public class RomanToInteger {

//    13. Roman to Integer
//    Easy
//
//    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
//
//    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII,
//    which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four
//    is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract
//    it making four. The same principle applies to the number nine, which is written as IX. There are six
//    instances where subtraction is used:
//
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.
//    Given a roman numeral, convert it to an integer.

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));        // 1994
        System.out.println(romanToInt("IV"));             // 4
        System.out.println(romanToInt("V"));              // 5
        System.out.println(romanToInt("MMMCMXCIX"));      // 3999
    }

//    Approach 3: Right-to-Left Pass
//    Time complexity  : O(1)
//    Space complexity : O(1)

    public static int romanToInt(String s) {
        Map<Character, Integer> symbols = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        if (s.length() == 1) {
            return symbols.get(s.charAt(0));
        }
        int rsl = symbols.get(s.charAt(s.length() - 1));
        for (int i = 1; i < s.length(); i++) {
            int prev = symbols.get(s.charAt(i - 1));
            int curr = symbols.get(s.charAt(i));
            if (prev < curr) {
                rsl -= prev;
            } else {
                rsl += prev;
            }
        }
        return rsl;
    }
}
