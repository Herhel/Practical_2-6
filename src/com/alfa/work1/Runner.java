package com.alfa.work1;

public class Runner {
    public void run() {
        int a = 15;
        int b = 0;
        try {
            System.out.println("Result: " + divisionInt(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        double aa = 11.1;
        double bb = 0.0;
        try {
            System.out.println("Result: " + divisionDouble(aa, bb));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public int divisionInt(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public int divisionDouble(double a, double b) throws ArithmeticException {
        if (b == 0.0) {
            throw new ArithmeticException("Error - > by zero double numbers");
        }
        return (int) (a / b);
    }
}
