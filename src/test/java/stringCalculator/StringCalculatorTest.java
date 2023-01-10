package stringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    void stringWithNoSymbolAtEndTest() {
        assertEquals(0, StringCalculator.countString("4,7.4;2,7.3"));
    }

    @Test
    void sumWithTwoDifferentSymbolsAtEndTest() {
        assertEquals(6, StringCalculator.countString("3,3-+"));
    }

    @Test
    void sumOfTwoNumbersTest() {
        assertEquals(26, StringCalculator.countString("21;5+"));
    }

    @Test
    void subtractionOfTwoNumbersTest() {
        assertEquals(4, StringCalculator.countString("10.6-"));
    }

    @Test
    void multiplicationOfTwoNumbersTest() {
        assertEquals(8, StringCalculator.countString("2;4*"));
    }

    @Test
    void divisionOfTwoNumbersTest() {
        assertEquals(0.50, StringCalculator.countString("1,2/"));
    }

    @Test
    void sumOfFiveNumbersWithDifferentSymbolsTest() {
        assertEquals(68 , StringCalculator.countString("45;6,2.6,9+"));
    }

    @Test
    void subtractionOfFiveNumbersWithDifferentSymbolsTest() {
        assertEquals(-10, StringCalculator.countString("6.7,1;5,3-"));
    }

    @Test
    void multiplicationOfFiveNumbersWithDifferentSymbolsTest() {
        assertEquals(144, StringCalculator.countString("2,3;6;1.4*"));
    }

    @Test
    void divisionOfFiveNumbersWithDifferentSymbolsTest() {
        assertEquals(1, StringCalculator.countString("60,2;3,2,5/"));
    }

    @Test
    void sumWithNegativeNumbersTest() {
        assertEquals(56, StringCalculator.countString("45;-6,2.6,9+"));
    }

    @Test
    void subtractionWithNegativeNumbersTest() {
        assertEquals(0, StringCalculator.countString("6.7,1;-5,3-"));
    }

    @Test
    void multiplicationWithNegativeNumbersTest() {
        assertEquals(144, StringCalculator.countString("2,-3;6;-1.4*"));
    }

    @Test
    void divisionWithNegativeNumbersTest() {
        assertEquals(-1, StringCalculator.countString("60,2;-3,2,5/"));
    }

    @Test
    void sumOfOnlyNegativeNumbers() {
        assertEquals(-25, StringCalculator.countString("-5;-7;-10,-3+"));
    }

    @Test
    void multiplicationOfOnlyNegativeNumbers() {
        assertEquals(-105, StringCalculator.countString("-5,-7;-3*"));
    }

}
