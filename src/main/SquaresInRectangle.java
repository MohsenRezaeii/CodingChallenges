package main;

import java.util.ArrayList;
import java.util.List;

public class SquaresInRectangle {

    public static List<Integer> sqInRect(int lng, int wdth) {

        // (10, 3) -> {3, 3, 3, 1}
        // (8, 6) -> {6, 2, 2, 2}
        // (5, 3) -> {3, 2, 1, 1}
        // (20, 14) -> {14, 6, 6, 2, 2, 2}
        // (14, 6) -> {6, 6, 2}
        List<Integer> result = new ArrayList<>();
        if (lng / 2 > wdth) {
            result.add(wdth);
            result.add(wdth);
            int tempWdth = wdth;
            wdth = lng - (wdth * 2);
            lng = tempWdth;
            sqInRect(lng, wdth);
        } else {
            int lngMinusWdth = lng - wdth;
            result.add(wdth);
            result.add(lngMinusWdth);
            while (lngMinusWdth > 1) {
                lng = wdth;
                wdth = lngMinusWdth;
                sqInRect(lng, wdth);
            }
        }
        return result;
    }
}
