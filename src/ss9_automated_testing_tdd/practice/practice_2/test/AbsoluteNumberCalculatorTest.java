package ss9_automated_testing_tdd.practice.practice_2.test;

import org.junit.jupiter.api.Test;
import ss9_automated_testing_tdd.practice.practice_2.AbsoluteNumberCalculator;

public class AbsoluteNumberCalculatorTest {
    private void assertEquals(int expected, int result) {
    }

    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}
