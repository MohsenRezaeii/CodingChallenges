package com.mohsen.codingchallenges;

import java.util.ArrayList;
import java.util.List;

public class SquaresInRectangle {

    /**
     * This method computes the largest squares that can fit inside a rectangle
     * with given dimensions length and width, and returns a list of the sizes
     * of these squares in descending order.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return a list of integers representing the sizes of the largest squares
     *         that can fit inside the rectangle
     *
     * Examples:
     * - (10, 3) -> {3, 3, 3, 1}
     * - (8, 6) -> {6, 2, 2, 2}
     * - (5, 3) -> {3, 2, 1, 1}
     * - (20, 14) -> {14, 6, 6, 2, 2, 2}
     * - (14, 6) -> {6, 6, 2}
     */
    public static List<Integer> largestSquaresInRectangle(int length, int width) {
        List<Integer> result = new ArrayList<>();
        if (length <= 0 || width <= 0) {
            return result;
        }

        while (length != width) {
            if (length > width) {
                result.add(width);
                length -= width;
            } else {
                result.add(length);
                width -= length;
            }
        }
        result.add(length);
        return result;
    }

}
