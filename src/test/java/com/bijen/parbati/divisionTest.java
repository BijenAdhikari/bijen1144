package com.bijen.parbati;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class divisionTest {

    @Test
    public void testDivide() {
        division calculator = new division();
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
}