package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpinWordsTest {
    @Test
    public void testSpinWords_withShortWord() {
        String result = SpinWords.spinWords("Hello World");
        assertEquals("olleH dlroW", result);
    }

    @Test
    public void testSpinWords_withLongWord() {
        String result = SpinWords.spinWords("Programming is fun");
        assertEquals("gnimmargorP is fun", result);
    }

    @Test
    public void testSpinWords_withMixedWords() {
        String result = SpinWords.spinWords("Spin those Words");
        assertEquals("Spin esoht sdroW", result);
    }

    @Test
    public void testSpinWords_withEmptyString() {
        String result = SpinWords.spinWords("");
        assertEquals("", result);
    }

    @Test
    public void testSpinWords_withSingleCharacterWords() {
        String result = SpinWords.spinWords("A B C");
        assertEquals("A B C", result);
    }
}
