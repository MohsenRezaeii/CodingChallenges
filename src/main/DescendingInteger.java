package main;

import java.util.stream.IntStream;

public class DescendingInteger {
//    Your task is to make a function that can take any
//    non-negative integer as an argument and return it
//    with its digits in descending order. Essentially,
//    rearrange the digits to create the highest possible number.
//    Examples:
//    Input: 42145 Output: 54421
//    Input: 145263 Output: 654321
//    Input: 123456789 Output: 987654321
    public static int sortDesc(final int num) {
        IntStream st = String.valueOf(num).chars()
                .map(Character::getNumericValue).boxed()
                .sorted((n1, n2) -> Integer.compare(n2, n1))
                .mapToInt(Integer::intValue);
        StringBuilder resultString = new StringBuilder();
        st.forEach(i -> resultString.append(i));
        return Integer.valueOf(resultString.toString());
    }

}
