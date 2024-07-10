package com.mohsen.codingchallenges;

import main.java.CountingDuplicates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountingDuplicatesTest {

    @Test
    public void testabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix() {
        int result = CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        Assertions.assertEquals(26, result);
    }

    @Test
    public void testemptyReturnsZero() {
        int result = CountingDuplicates.duplicateCount("");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testIndivisibilitiesReturnsTwo() {
        int result = CountingDuplicates.duplicateCount("Indivisibilities");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzReturnsTwentySix() {
        int result = CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        Assertions.assertEquals(26, result);
    }

    @Test
    public void testabcdeaBReturnsTwo() {
        int result = CountingDuplicates.duplicateCount("abcdeaB");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testabcdeaaReturnsOne() {
        int result = CountingDuplicates.duplicateCount("abcdeaa");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testabcdefghijklmnopqrstuvwxyzaaAbReturnsTwo() {
        int result = CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzaaAb");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testabcdefghijklmnopqrstuvwxyzReturnsZero() {
        int result = CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyz");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testabcdeReturnsZero() {
        int result = CountingDuplicates.duplicateCount("abcde");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testabcdeaReturnsOne() {
        int result = CountingDuplicates.duplicateCount("abcdea");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void indivisibilityReturnsOne() {
        int result = CountingDuplicates.duplicateCount("indivisibility");
        Assertions.assertEquals(1, result);
    }
}
