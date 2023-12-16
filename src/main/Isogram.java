package main;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

//    An isogram is a word that has no repeating letters,
//    consecutive or non-consecutive. Implement a function
//    that determines whether a string that contains only
//    letters is an isogram. Assume the empty string is an
//    isogram. Ignore letter case.
//    Example: (Input --> Output)
//    "Dermatoglyphics" --> true
//    "aba" --> false
//    "moOse" --> false (ignore letter case)
    public static boolean isIsogram(String str) {
        Set<Character> charSet = new HashSet<>();
        for (char c : str.toLowerCase().toCharArray()) {
            charSet.add(c);
        }
        return charSet.size() == str.length();
        // Alternative:
        // return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
