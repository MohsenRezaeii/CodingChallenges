package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpinWordsTest {
    @Test
    public void testSpinWords_withShortWord() {
        String result = SpinWords.spinWords("Hello World");
        Assertions.assertEquals("olleH dlroW", result);
    }

    @Test
    public void testSpinWords_withLongWord() {
        String result = SpinWords.spinWords("Programming is fun");
        Assertions.assertEquals("gnimmargorP is fun", result);
    }

    @Test
    public void testSpinWords_withMixedWords() {
        String result = SpinWords.spinWords("Spin those Words");
        Assertions.assertEquals("Spin esoht sdroW", result);
    }

    @Test
    public void testSpinWords_withEmptyString() {
        String result = SpinWords.spinWords("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void testSpinWords_withSingleCharacterWords() {
        String result = SpinWords.spinWords("A B C");
        Assertions.assertEquals("A B C", result);
    }
}
