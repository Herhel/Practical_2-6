package com.alfa.work3;

import java.util.Arrays;

public class Runner {
    private int collectionCounter = 0;

    public void run() {
        Shape[] collection = new Shape[10];
        createShapes(collection);
        printShapes(collection);
    }

    private void createShapes(Shape[] collection) {
        addShape(collection, "Rectangle:RED:10,20");
        addShape(collection, "Circle:BLACK:10");
        addShape(collection, "Triangle:GREEN:9,7,12");
        addShape(collection, "Rectangle:RED:10,20sm");
        addShape(collection, "Circle:BLACK:a10");
        addShape(collection, "Triangle:GREEN:9+7,12");
        addShape(collection, "Circle:BLACK10");
        addShape(collection, "Triangle;GREEN:9,7,12");
        addShape(collection, "Rectangle:RED+10,20");
        addShape(collection, "Circle::BLACK:10");
        addShape(collection, "Triangle:GREEN:9:7,12");
    }

    private void addShape(Shape[] collection, String params) {
        if (collection.length == collectionCounter) {
            collection = Arrays.copyOf(collection, (int) (collection.length * 1.5));
        }
        try {
            collection[collectionCounter] = Shape.parseShape(params);
            collectionCounter++;
        } catch (InvalidShapeStringException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printShapes(Shape[] shapes) {
        System.out.println("\nФигуры в коллекции:");
        if (shapes != null && shapes.length > 0) {
            for (Shape shape : shapes) {
                if (shape != null) {
                    shape.draw();
                }
            }
        } else {
            System.out.println("\nНет элементов для вывода");
        }
    }
}
