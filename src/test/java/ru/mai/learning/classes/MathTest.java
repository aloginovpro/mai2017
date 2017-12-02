package ru.mai.learning.classes;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;
import static ru.mai.learning.classes.testing.Math.solve;

public class MathTest {

    @Test
    public void testDivisionZeroByZero() {
        Double actual = solve(0, 0);
        assertNull(actual);
    }

    @Test
    public void testDivisionNotZeroByZero() {
        Double actual = solve(1, 0);
        assertNull(actual);
    }

    @Test
    public void test1() {
        Double actual = solve(2, 2);
        assertEquals(-1.0, actual);
    }

    @Test
    public void test2() {
        Double actual = solve(2, 3);
        assertEquals(-1.5, actual);
    }

}
