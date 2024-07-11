package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BanjoTest {

    @Test
    public void testPlayingBanjo() {
        String startsWithR = Banjo.areYouPlayingBanjo("Rick");
        assertEquals(startsWithR, "Rick plays banjo");
    }

    @Test
    public void testNotPlayingBanjo() {
        String startsWithR = Banjo.areYouPlayingBanjo("Ben");
        assertEquals(startsWithR, "Ben does not play banjo");
    }

    @Test
    public void testPlayingBanjoCaseInsensitive() {
        String result = Banjo.areYouPlayingBanjo("rachel");
        assertEquals("rachel plays banjo", result);
    }

    @Test
    public void testNotPlayingBanjoEmptyString() {
        String result = Banjo.areYouPlayingBanjo("");
        assertEquals(" does not play banjo", result);
    }

}
