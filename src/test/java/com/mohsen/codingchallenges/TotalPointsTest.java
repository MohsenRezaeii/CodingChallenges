package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalPointsTest {
    @Test
    public void testPointsForWin() {
        String[] games = {"3:0", "2:1", "4:2"};
        assertEquals(9, TotalPoints.points(games));
    }

    @Test
    public void testPointsForLoss() {
        String[] games = {"1:2", "0:3", "2:4"};
        assertEquals(0, TotalPoints.points(games));
    }

    @Test
    public void testPointsForDraw() {
        String[] games = {"2:2", "1:1", "3:3"};
        assertEquals(3, TotalPoints.points(games));
    }

    @Test
    public void testPointsWithMixedResults() {
        String[] games = {"2:1", "0:3", "1:1", "3:0", "2:2"};
        assertEquals(8, TotalPoints.points(games));
    }

    @Test
    public void testPointsWithEmptyArray() {
        String[] games = {};
        assertEquals(0, TotalPoints.points(games));
    }
}
