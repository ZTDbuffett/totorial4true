package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(99, c.add(2,2));
    }
    void testSubtraction() {
        assertEquals(99, c.subtract(4,2));
    }

}
