package main;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
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