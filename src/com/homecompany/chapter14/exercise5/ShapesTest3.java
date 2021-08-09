package com.homecompany.chapter14.exercise5;

import com.homecompany.chapter14.exercise3.*;

import java.util.Arrays;
import java.util.List;

class ShapesTest3 {
    public static void main (String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for (Shape shape: shapeList) {
            shape.draw();
            Shape.rotate(shape);
        }
    }
}
