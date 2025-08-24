package org.example.array.example;

import java.util.Arrays;

public class DesignAnATMMachine {

//    2241. Design an ATM Machine
//    Medium
//
//    There is an ATM machine that stores banknotes of 5 denominations: 20, 50, 100, 200, and 500 dollars.
//    Initially the ATM is empty. The user can use the machine to deposit or withdraw any amount of money.
//
//    When withdrawing, the machine prioritizes using banknotes of larger values.
//
//    - For example, if you want to withdraw $300 and there are 2 $50 banknotes, 1 $100 banknote, and 1 $200 banknote,
//    then the machine will use the $100 and $200 banknotes.
//    - However, if you try to withdraw $600 and there are 3 $200 banknotes and 1 $500 banknote, then the withdraw
//    request will be rejected because the machine will first try to use the $500 banknote and then be unable
//    to use banknotes to complete the remaining $100. Note that the machine is not allowed to use the $200 banknotes
//    instead of the $500 banknote.
//
//    Implement the ATM class:
//
//    - ATM() Initializes the ATM object.
//    - void deposit(int[] banknotesCount) Deposits new banknotes in the order $20, $50, $100, $200, and $500.
//    - int[] withdraw(int amount) Returns an array of length 5 of the number of banknotes that will be handed
//    to the user in the order $20, $50, $100, $200, and $500, and update the number of banknotes in the ATM after
//    withdrawing. Returns [-1] if it is not possible (do not withdraw any banknotes in this case).

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.deposit(new int[]{0, 0, 1, 2, 1});
        System.out.println(Arrays.toString(atm.withdraw(600))); // [0, 0, 1, 0, 1]
        atm.deposit(new int[]{0, 1, 0, 1, 1});
        System.out.println(Arrays.toString(atm.withdraw(600))); // [-1]
        System.out.println(Arrays.toString(atm.withdraw(550))); // [0, 1, 0, 0, 1]
    }
}

class ATM {

    private final long[] banknotes;
    private final int[] denom;

    public ATM() {
        banknotes = new long[5];
        denom = new int[]{20, 50, 100, 200, 500};
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            banknotes[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int probe = amount;
        for (int i = 4; i >= 0; i--) {
            probe -= (int) (denom[i] * Math.min((probe / denom[i]), banknotes[i]));
        }
        if (probe != 0) {
            return new int[]{-1};
        }
        int[] rsl = new int[5];
        for (int i = 4; i >= 0; i--) {
            rsl[i] = (int) Math.min((amount / denom[i]), banknotes[i]);
            amount -= denom[i] * rsl[i];
            banknotes[i] -= rsl[i];
        }
        return rsl;
    }
}
