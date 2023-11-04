package test;

import main.Banjo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BanjoTest {
    @Test
    public void isPlayingBanjo_whenNameStartsWithR_thenTrue() {
        String startsWithR = Banjo.areYouPlayingBanjo("Rick");
        Assertions.assertEquals(startsWithR, "Rick plays banjo");
    }

    @Test
    public void isPlayingBanjo_whenNameNotStartsWithR_thenFalse() {
        String startsWithR = Banjo.areYouPlayingBanjo("Ben");
        Assertions.assertEquals(startsWithR, "Ben does not play banjo");
    }
}
