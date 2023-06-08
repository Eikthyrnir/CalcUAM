package com.mycompany.calculator;

public class Calculator {


    public double powerTwoNumbers(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }


    public double CalculateSquareArea(int a) {
        return a * a;
    }

    public double CalculateRectArea(int a, int b) {
        return a * b;
    }

    public int CalculateSquareCirc(int a) {
        return 4 * a;
    }

    public int CalculateRectCirc(int a, int b) {
        return 2 * a + 2 * b;
    }

    public double CalculateTriangleArea(int a, int h) {
        return (a * h) / 2.0;
    }

    public double CalculateTriangleCirc(int a, int b, int c) {
        return a + b + c;
    }

    public double convertCelsiusToFarenheit(double celcius) {
        return celcius * 9 / 5.0 + 32;
    }

    public double convertFarenheitToCelsius(double farenheit) {
        return (5 / 9.0) * (farenheit - 32);
    }

    public double convertFromMphToKph(int mph) {
        return mph * 1.609344;
    }

    public int factorial(int i) {
        if (i < 1) return 1;
        else return i * factorial(i - 1);
    }

    public int fibbonacci(int i) {
        if (i == 0 || i == 1) return i;
        return fibbonacci(i - 1) + fibbonacci(i - 2);
    }

    public int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }

    public int findLCM(int a, int b) {
        return a * b / findGCD(a, b);
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
