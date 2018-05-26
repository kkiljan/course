package pl.kkiljan.lesson21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RangeTest {

@Test
    public void shouldSayThat15rIsInRange() {
        Range range = new Range(10, 20);
        Assertions.assertTrue(range.isInRange(15));
    }
}
