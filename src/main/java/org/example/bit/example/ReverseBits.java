package org.example.bit.example;

public class ReverseBits {

//    190. Reverse Bits
//    Easy
//
//    Reverse bits of a given 32 bits unsigned integer.
//
//    Note:
//
//    - Note that in some languages, such as Java, there is no unsigned integer type. In this case, both input and output
//    will be given as a signed integer type. They should not affect your implementation, as the integer's internal
//    binary representation is the same, whether it is signed or unsigned.
//    - In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 2 above,
//    the input represents the signed integer -3 and the output represents the signed integer -1073741825.

    public static void main(String[] args) {
        System.out.println(reverseBits(43_261_596));
        // 43_261_596 (00000010100101000001111010011100) -> 964_176_192 (00111001011110000010100101000000)
    }

//    Approach 1: Bit by Bit

    public static int reverseBits(int n) {
        int rsl = 0;
        int power = 31;
        while (n != 0) {
            rsl += (n & 1) << power;
            n >>>= 1;
            power--;
        }
        return rsl;
    }
}
