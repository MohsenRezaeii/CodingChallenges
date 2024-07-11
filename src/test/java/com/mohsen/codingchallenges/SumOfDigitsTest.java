package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsTest {

    @Test
    public void testCalculate123() {
        assertEquals(6, SumOfDigits.calculate(123));
    }

    @Test
    public void testCalculateWithZero() {
        assertEquals(0, SumOfDigits.calculate(0));
    }

    @Test
    public void testCalculateWithNegativeNumber() {
        assertEquals(6, SumOfDigits.calculate(-123));
    }

    @Test
    public void testCalculateWithLargeNumber() {
        assertEquals(45, SumOfDigits.calculate(123456789));
    }

    @Test
    public void testCalculateWithLargeNegativeNumber() {
        assertEquals(45, SumOfDigits.calculate(-123456789));
    }
}
