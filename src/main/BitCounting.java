package main;

public class BitCounting {

//    Write a function that takes an integer as input,
//    and returns the number of bits that are equal to
//    one in the binary representation of that number.
//    You can guarantee that input is non-negative.

//    Example: The binary representation of 1234 is
//    10011010010, so the function should return 5
//    in this case

    public static int countBits(int n) {
        char[] bitChar = Integer.toBinaryString(n).toCharArray();
        int numOfOnes = 0;
        for (char c : bitChar) {
            if (c == '1')
                numOfOnes++;
        }
        return numOfOnes;

//        Alternative, more efficient:
//        return Integer.bitCount(n);
    }

}