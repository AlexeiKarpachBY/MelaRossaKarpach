package OOP.All_Lessons.LessonFOUR;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    private static final int MINUS_TWO = -2;
    private static final int MINUS_ONE = -1;
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final double FIVE = 5;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;


    @org.junit.Test
    public void division() {
    }

    @org.junit.Test
    public void multiplication() {
    }

    @org.junit.Test
    public void difference() {
    }

    @org.junit.Test
    public void sum() {
    }

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void testDivision() {
        BigDecimal actual = calculator.division(THREE, ONE);
        BigDecimal expected = new BigDecimal("3");
        assertEquals(actual, expected);
    }

    @Test
    public void testMultiplicationPositive() {
        int actual = calculator.multiplication(TWO, ONE);
        int expected = TWO;
        assertEquals(actual, expected);
    }
    @Test
    public void testMultiplicationPositiveMinus() {
        int actual = calculator.multiplication(TWO, MINUS_ONE);
        int expected = MINUS_TWO;
        assertEquals(actual, expected);
    }
    @Test
    public void testMultiplicationMinusMinus() {
        int actual = calculator.multiplication(MINUS_TWO, MINUS_ONE);
        int expected = TWO;
        assertEquals(actual, expected);
    }




    @Test
    public void testDifferencePositive() {
        int actual = calculator.difference(TWO, ONE);
        int expected = ONE;
        assertEquals(actual, expected);
    }
    @Test
    public void testDifferencePositiveMinus() {
        int actual = calculator.difference(ONE, MINUS_ONE);
        int expected = TWO;
        assertEquals(actual, expected);
    }
    @Test
    public void testDifferenceMinusMinus() {
        int actual = calculator.difference(MINUS_ONE, MINUS_ONE);
        int expected = ZERO;
        assertEquals(actual, expected);
    }


    @Test
    public void testSumPositive() {
        int actual = calculator.sum(ONE, TWO);
        int expected = THREE;
        assertEquals(actual, expected);
    }
    @Test
    public void testSumMinusPlusMinus() {
        int actual = calculator.sum(MINUS_ONE,MINUS_ONE);
        int expected = MINUS_TWO;
        assertEquals(actual, expected);
    }
    @Test
    public void testSumPositivePlusMinus() {
        int actual = calculator.sum(EIGHT, MINUS_ONE);
        int expected = SEVEN;
        assertEquals(actual, expected);
    }

    @Test
    public void testToString() {
    }
}