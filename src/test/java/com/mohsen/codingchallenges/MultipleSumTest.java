package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleSumTest {

    @Test
    public void testSumOfMultiplesOf3And5Below10() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(10);
        assertEquals(23, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5Below100() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(100);
        assertEquals(2318, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5Below1000() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(1000);
        assertEquals(233168, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5Below0() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(0);
        assertEquals(0, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5BelowNegativeNumber() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(-10);
        assertEquals(0, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5Below3() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(3);
        assertEquals(0, result);
    }

    @Test
    public void testSumOfMultiplesOf3And5Below5() {
        int result = MultipleSum.sumOfMultiplesOf3And5Below(5);
        assertEquals(3, result);
    }
}
