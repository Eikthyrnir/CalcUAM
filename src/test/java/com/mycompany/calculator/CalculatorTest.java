package com.mycompany.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @Test
    public void addTwoNumbersTest() {
        assertEquals(8, calculator.CalculateRectCirc(2, 2));
    }

    @Test
    public void testPowerTwoNumbers() {
        assertEquals(
                Math.pow(2, 3),
                calculator.powerTwoNumbers(2, 3)
        );
    }

    @Test
    public void testSqrt() {
        assertEquals(
                Math.sqrt(3),
                calculator.sqrt(3)
        );
    }

    @Test
    public void testCalculateSquareArea() {
        assertEquals(
                3 * 3,
                calculator.CalculateSquareArea(3)
        );
    }

    @Test
    public void testCalculateRectArea() {
        assertEquals(
                2 * 3,
                calculator.CalculateRectArea(2, 3)
        );
    }

    @Test
    public void testCalculateSquareCirc() {
        assertEquals(
                4 * 3,
                calculator.CalculateSquareCirc(3)
        );
    }

    @Test
    public void testCalculateRectCirc() {
        assertEquals(
                2 * 3 + 2 * 2,
                calculator.CalculateRectCirc(3, 2)
        );
    }

    @Test
    public void testCalculateTriangleArea() {
        assertEquals(
                3 * 2 * 0.5,
                calculator.CalculateTriangleArea(3, 2)
        );
        assertEquals(
                3 * 3 * 0.5,
                calculator.CalculateTriangleArea(3, 3)
        );
    }

    @Test
    public void testCalculateTriangleCirc() {
        assertEquals(
                3 + 2 + 4,
                calculator.CalculateTriangleCirc(3, 2, 4)
        );
    }

    @Test
    public void testConvertCelsiusToFarenheit() {
        int celcius = 36;
        assertEquals(
                (9 / 5.0) * celcius + 32,
                calculator.convertCelsiusToFarenheit(celcius)
        );
    }

    @Test
    public void testConvertFarenheitToCelsius() {
        int farenheit = 36;
        assertEquals(
                (5 / 9.0) * (farenheit - 32),
                calculator.convertFarenheitToCelsius(farenheit)
        );
    }

    @Test
    public void testConvertFromMphToKph() {
        int mph = 100;
        assertEquals(
                mph * 1.609344,
                calculator.convertFromMphToKph(mph)
        );
    }

    @Test
    public void testFactorial() {
        int[] fact = {1, 1, 2, 2 * 3};
        for (int i = 0; i < fact.length; i++) {
            assertEquals(
                    fact[i],
                    calculator.factorial(i)
            );
        }
    }

    @Test
    public void testFibbonacci() {
        int[] fibs = {0, 1, 1, 2, 3, 5, 8, 13};
        for (int i = 0; i < fibs.length; i++) {
            assertEquals(
                    fibs[i],
                    calculator.fibbonacci(i)
            );
        }
    }

    @Test
    public void testFindGCD() {
        assertEquals(
                4,
                calculator.findGCD(12, 28)
        );
        assertEquals(
                calculator.findGCD(28, 12),
                calculator.findGCD(12, 28)
        );
    }

    @Test
    public void testFindLCM() {
        assertEquals(
                3 * 4 * 7,
                calculator.findLCM(12, 28)
        );
    }

    @Test
    public void correctLCMUsingGCD() {
        assertEquals(
                Math.abs(12 * 28) / calculator.findGCD(12, 28),
                calculator.findLCM(12, 28)
        );
    }

    @Test
    public void testIsPrime() {
        assertFalse(calculator.isPrime(1));
        assertTrue(calculator.isPrime(2));
        assertFalse(calculator.isPrime(4));
        assertFalse(calculator.isPrime(9));
        assertTrue(calculator.isPrime(11));
        assertFalse(calculator.isPrime(12));
        assertFalse(calculator.isPrime(49));
    }
}