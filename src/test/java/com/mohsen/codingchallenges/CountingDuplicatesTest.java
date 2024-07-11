package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingDuplicatesTest {

    @Test
    public void testabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix() {
        int result = CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals(26, result);
    }

    @Test
    public void testemptyReturnsZero() {
        int result = CountingDuplicates.duplicateCount("");
        assertEquals(0, result);
    }

    @Test
    public void testIndivisibilitiesReturnsTwo() {
        int result = CountingDuplicates.duplicateCount("Indivisibilities");
        assertEquals(2, result);
    }

    @Test
    public void testabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzReturnsTwentySix() {
        int result = CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        assertEquals(26, result);
    }

    @Test
    public void testabcdeaBReturnsTwo() {
        int result = CountingDuplicates.duplicateCount("abcdeaB");
        assertEquals(2, result);
    }

    @Test
    public void testabcdeaaReturnsOne() {
        int result = CountingDuplicates.duplicateCount("abcdeaa");
        assertEquals(1, result);
    }

    @Test
    public void testabcdefghijklmnopqrstuvwxyzaaAbReturnsTwo() {
        int result = CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzaaAb");
        assertEquals(2, result);
    }

    @Test
    public void testabcdefghijklmnopqrstuvwxyzReturnsZero() {
        int result = CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyz");
        assertEquals(0, result);
    }

    @Test
    public void testabcdeReturnsZero() {
        int result = CountingDuplicates.duplicateCount("abcde");
        assertEquals(0, result);
    }

    @Test
    public void testabcdeaReturnsOne() {
        int result = CountingDuplicates.duplicateCount("abcdea");
        assertEquals(1, result);
    }

    @Test
    public void indivisibilityReturnsOne() {
        int result = CountingDuplicates.duplicateCount("indivisibility");
        assertEquals(1, result);
    }
}
