package com.alfa.work3;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        return super.toString() + ", a=" + a + ", b=" + b + ", c=" + c;
    }

    @Override
    public double calcArea() {
        int p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void draw() {
        System.out.printf(this + ", area=%.2f \n", calcArea());
    }


    public static Triangle parseTriangle(String[] params) throws InvalidShapeStringException {
        String[] shapeDimensions = params[2].split(",");
        try {
            return new Triangle(params[1], Integer.parseInt(shapeDimensions[0]),
                    Integer.parseInt(shapeDimensions[1]), Integer.parseInt(shapeDimensions[2]));
        } catch (NumberFormatException e) {
            throw new InvalidShapeStringException("Неверный формат данных размера треугольника " + params[2]);
        }
    }
}
