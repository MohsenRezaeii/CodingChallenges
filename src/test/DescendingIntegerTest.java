package test;

import main.DescendingInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DescendingIntegerTest {
    @Test
    public void testSortDescWithSingleDigit() {
        int result = DescendingInteger.sortDesc(5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSortDescWithMultipleDigits() {
        int result = DescendingInteger.sortDesc(12345);
        Assertions.assertEquals(54321, result);
    }

    @Test
    public void testSortDescWithRepeatingDigits() {
        int result = DescendingInteger.sortDesc(122354);
        Assertions.assertEquals(543221, result);
    }

    @Test
    public void testSortDescWithZero() {
        int result = DescendingInteger.sortDesc(102030);
        Assertions.assertEquals(321000, result);
    }

    @Test
    public void testSortDescWithZeroInput() {
        int result = DescendingInteger.sortDesc(0);
        Assertions.assertEquals(0, result);
    }
}
