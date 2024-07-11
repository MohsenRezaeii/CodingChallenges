package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescendingIntegerTest {
    @Test
    public void testSortDescWithSingleDigit() {
        int result = DescendingInteger.sortDesc(5);
        assertEquals(5, result);
    }

    @Test
    public void testSortDescWithMultipleDigits() {
        int result = DescendingInteger.sortDesc(12345);
        assertEquals(54321, result);
    }

    @Test
    public void testSortDescWithRepeatingDigits() {
        int result = DescendingInteger.sortDesc(122354);
        assertEquals(543221, result);
    }

    @Test
    public void testSortDescWithZero() {
        int result = DescendingInteger.sortDesc(102030);
        assertEquals(321000, result);
    }

    @Test
    public void testSortDescWithZeroInput() {
        int result = DescendingInteger.sortDesc(0);
        assertEquals(0, result);
    }
}
