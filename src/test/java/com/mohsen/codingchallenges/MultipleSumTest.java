package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultipleSumTest {

    @Test
    public void testSumOfMultiplesOf3And5Below10() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(10);
        Assertions.assertEquals(23, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5Below100() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(100);
        Assertions.assertEquals(2318, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5Below1000() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(1000);
        Assertions.assertEquals(233168, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5Below0() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5BelowNegativeNumber() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(-10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5Below3() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(3);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5Below5() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(5);
        Assertions.assertEquals(3, result);
    }
}
