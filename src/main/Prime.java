package main;

import java.util.stream.IntStream;

public class Prime {
    public static boolean isPrime(int num) {
        return num > 1 && IntStream.range(1, num > 10 ? num / 2 : num).limit(100000).filter(n -> num % n == 0).count() == 1;
        // Alternative solution:
//        if (num < 2)
//            return false;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0)
//                return false;
//        }
//        return true;
    }
}