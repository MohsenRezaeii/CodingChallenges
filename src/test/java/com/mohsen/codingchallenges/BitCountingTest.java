package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BitCountingTest {

    @Test
    public void testCountBitsWithZero() {
        int result = BitCounting.countBits(0);
        Assertions.assertEquals(0, result, "Count of bits for 0 should be 0");
    }

    @Test
    public void testCountBitsWithPositiveNumber() {
        int result = BitCounting.countBits(10);
        Assertions.assertEquals(2, result, "Count of bits for 10 should be 2");
    }

    @Test
    public void testCountBitsWithNegativeNumber() {
        int result = BitCounting.countBits(-5);
        Assertions.assertEquals(31, result, "Count of bits for -5 should be 31");
    }

    @Test
    public void testCountBitsWithLargeNumber() {
        int result = BitCounting.countBits(Integer.MAX_VALUE);
        Assertions.assertEquals(31, result, "Count of bits for Integer.MAX_VALUE should be 31");
    }
}
