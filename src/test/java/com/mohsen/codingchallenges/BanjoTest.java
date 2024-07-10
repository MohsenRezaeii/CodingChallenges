package com.mohsen.codingchallenges;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BanjoTest {

    @Test
    public void testPlayingBanjo() {
        String startsWithR = Banjo.areYouPlayingBanjo("Rick");
        Assertions.assertEquals(startsWithR, "Rick plays banjo");
    }

    @Test
    public void testNotPlayingBanjo() {
        String startsWithR = Banjo.areYouPlayingBanjo("Ben");
        Assertions.assertEquals(startsWithR, "Ben does not play banjo");
    }

    @Test
    public void testPlayingBanjoCaseInsensitive() {
        String result = Banjo.areYouPlayingBanjo("rachel");
        Assertions.assertEquals("rachel plays banjo", result);
    }

    @Test
    public void testNotPlayingBanjoEmptyString() {
        String result = Banjo.areYouPlayingBanjo("");
        Assertions.assertEquals(" does not play banjo", result); // Empty name should return " does not play banjo"
    }

}
