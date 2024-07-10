package com.mohsen.codingchallenges;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

//    Write a function that will return the count of distinct
//    case-insensitive alphabetic characters and numeric digits
//    that occur more than once in the input string. The input
//    string can be assumed to contain only alphabets (both
//    uppercase and lowercase) and numeric digits.
//    Example
//    "abcde" -> 0 # no characters repeats more than once
//    "aabbcde" -> 2 # 'a' and 'b'
//    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//    "indivisibility" -> 1 # 'i' occurs six times
//    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//    "aA11" -> 2 # 'a' and '1'
//    "ABBA" -> 2 # 'A' and 'B' each occur twice

    public static int duplicateCount(String text) {
        Map<Character, Integer> countCharacterMap = new HashMap<>();
        char[] chars = text.toLowerCase().toCharArray();
        for (char c : chars) {
            if (countCharacterMap.containsKey(c)) {
                int count = countCharacterMap.get(c);
                countCharacterMap.put(c, count + 1);
            } else {
                countCharacterMap.put(c, 1);
            }
        }
        return countCharacterMap.values().stream().sorted().dropWhile(n -> n <= 1).toList().size();
    }
}