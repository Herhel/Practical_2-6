package com.alfa.work3;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width=" + width + ", height=" + height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf(this + ", area=%.2f \n", calcArea());
    }

    public static Rectangle parseRectangle(String[] params) throws InvalidShapeStringException {
        String[] shapeDimensions = params[2].split(",");
        try {
            return new Rectangle(params[1], Integer.parseInt(shapeDimensions[0]),
                    Integer.parseInt(shapeDimensions[1]));
        } catch (NumberFormatException e) {
            throw new InvalidShapeStringException("Неверный формат данных размера прямоугольника " + params[2]);
        }
    }

}
