package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsogramTest {
    @Test
    public void testIsogramWithEmptyString() {
        String input = "";
        boolean result = Isogram.isIsogram(input);
        assertEquals(true, result);
    }

    @Test
    public void testIsogramWithSingleCharacterString() {
        String input = "a";
        boolean result = Isogram.isIsogram(input);
        assertEquals(true, result);
    }

    @Test
    public void testIsogramWithIsogramString() {
        String input = "Dermatoglyphics";
        boolean result = Isogram.isIsogram(input);
        assertEquals(true, result);
    }

    @Test
    public void testIsogramWithNonIsogramString() {
        String input = "aba";
        boolean result = Isogram.isIsogram(input);
        assertEquals(false, result);
    }

    @Test
    public void testIsogramWithIsogramStringIgnoringCase() {
        String input = "moOse";
        boolean result = Isogram.isIsogram(input);
        assertEquals(false, result);
    }

    @Test
    public void testIsogramWithHyphen() {
        String input = "thumbscrew-japingly";
        boolean result = Isogram.isIsogram(input);
        assertEquals(true, result);
    }
}
