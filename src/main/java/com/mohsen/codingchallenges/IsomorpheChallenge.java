package com.mohsen.codingchallenges;

import java.util.HashMap;
import java.util.Map;

public class IsomorpheChallenge {

    /**
     * Checks if two strings are isomorphic.
     *
     * Two strings are isomorphic if the characters in one string can be replaced to get the other string.
     * This means the order of the characters should be preserved, and a character in one string can only map to a single character in the other string.
     *
     * @param str1 The first string to compare.
     * @param str2 The second string to compare.
     * @return true if the strings are isomorphic, false otherwise.
     * @throws IllegalArgumentException if either input string is null or the strings have different lengths.
     */
    public static boolean isIsomorphic(String str1, String str2) {
        // Validate input strings for null values and ensure they are of equal length
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            throw new IllegalArgumentException("Input strings cannot be null or have different lengths.");
        }

        Map<Character, Character> characterMap = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char charFromS1 = str1.charAt(i);
            char charFromS2 = str2.charAt(i);

            if (characterMap.containsKey(charFromS1)) {
                if (characterMap.get(charFromS1) != charFromS2) {
                    return false;
                }
            } else if (characterMap.containsValue(charFromS2)) {
                return false;
            } else {
                characterMap.put(charFromS1, charFromS2);
            }
        }

        return true;
    }
}
