package org.example.math.example;

import java.util.Random;

public class ImplementRand10UsingRand7 {

//    470. Implement Rand10() Using Rand7()
//    Medium
//
//    Given the API rand7() that generates a uniform random integer in the range [1, 7], write a function rand10()
//    that generates a uniform random integer in the range [1, 10]. You can only call the API rand7(),
//    and you shouldn't call any other API. Please do not use a language's built-in random API.
//
//    Each test case will have one internal argument n, the number of times that your implemented function rand10()
//    will be called while testing. Note that this is not an argument passed to rand10().

    public static void main(String[] args) {
        System.out.println(Solution.rand10());
    }
}

//    Approach 1: Rejection Sampling
//    Time complexity  : O(1) average, but O(∞) worst case
//    Space complexity : O(1)

class Solution extends SolBase {

    public static int rand10() {
        int row;
        int col;
        int index;
        do {
            row = rand7();
            col = rand7();
            index = col + (row - 1) * 7;
        } while (index > 40);
        return 1 + (index - 1) % 10;
    }
}

class SolBase {

    public static int rand7() {
        return new Random().nextInt(1, 8);
    }
}
