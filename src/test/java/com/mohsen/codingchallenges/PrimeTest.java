package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeTest {
    @Test
    public void testIsPrimeWithPrimeNumber() {
        int input = 5;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        int input = 6;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testIsPrimeWithNegativeNumber() {
        int input = -5;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testIsPrimeWithZero() {
        int input = 0;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testIsPrimeWithFour() {
        int input = 4;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testIsPrimeWithOne() {
        int input = 1;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testIsPrimeWithTwo() {
        int input = 2;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testIsPrimeWithLargePrimeNumber() {
        int input = 2147483647;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testIsPrimeWithLargeNonPrimeNumber() {
        int input = 2147483646;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testIsPrimeWithLargeNegativeNumber() {
        int input = -2147483647;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testIsPrimeWithNine() {
        int input = 9;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testIsPrimeWith75() {
        int input = 75;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testIsPrimeWith973659107() {
        int input = 973659107;
        boolean result = Prime.isPrime(input);
        Assertions.assertEquals(false, result);
    }

}
