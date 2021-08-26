package com.alfa.work3;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.printf(this + ", area=%.2f \n", calcArea());
    }

    public static Circle parseCircle(String[] params) throws InvalidShapeStringException {
        try {
            return new Circle(params[1], Integer.parseInt(params[2]));
        } catch (NumberFormatException e) {
            throw  new InvalidShapeStringException("Неверный формат данных размера окружности " + params[2]);
        }
    }

}
