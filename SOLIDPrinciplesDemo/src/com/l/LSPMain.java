package com.l;

public class LSPMain {

    static void getAreaTest(Shape shape) {
        String shapeType = shape instanceof Rectangle ? "Rectangle" : "Square";
        System.out.println(shapeType + " - Expected area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Shape rect = new Rectangle(2, 3);
        getAreaTest(rect);

        Shape square = new Square(5);
        getAreaTest(square);
    }
}