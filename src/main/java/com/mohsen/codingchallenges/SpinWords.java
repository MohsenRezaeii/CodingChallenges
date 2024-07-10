package com.mohsen.codingchallenges;

import java.util.StringTokenizer;

public class SpinWords {
    //    Write a function that takes in a string of
//    one or more words, and returns the same string,
//    but with all five or more letter words reversed
//    (Just like the name of this Kata). Strings
//    passed in will consist of only letters and
//    spaces. Spaces will be included only when
//    more than one word is present.
//    Examples:
//    spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//    spinWords( "This is a test") => returns "This is a test"
//    spinWords( "This is another test" )=> returns "This is rehtona test"
    public static String spinWords(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        StringBuilder fullReversed = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.length() >= 5) {
                char[] chars = token.toCharArray();
                StringBuilder reversed = new StringBuilder();
                for (int i = chars.length - 1; i >= 0; i--) {
                    reversed.append(chars[i]);
                }
                token = reversed.toString();
            }
            fullReversed.append(" ").append(token);
        }
        return fullReversed.toString().trim();
    }
}
