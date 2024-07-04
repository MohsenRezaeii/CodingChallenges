package test;

import main.SumOfDigits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfDigitsTest {

    @Test
    public void testCalculate123() {
        Assertions.assertEquals(6, SumOfDigits.calculate(123));
    }

    @Test
    public void testCalculateWithZero() {
        Assertions.assertEquals(0, SumOfDigits.calculate(0));
    }

    @Test
    public void testCalculateWithNegativeNumber() {
        Assertions.assertEquals(6, SumOfDigits.calculate(-123));
    }

    @Test
    public void testCalculateWithLargeNumber() {
        Assertions.assertEquals(45, SumOfDigits.calculate(123456789));
    }

    @Test
    public void testCalculateWithLargeNegativeNumber() {
        Assertions.assertEquals(45, SumOfDigits.calculate(-123456789));
    }
}
