package com.homecompany.chapter14.exercise6;

import com.homecompany.chapter14.exercise3.*;

import java.util.Arrays;
import java.util.List;

class ShapesTest4 {
    public static void main (String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for (Shape shape: shapeList) {
            Shape.highlight(shape);
            shape.draw();
        }
    }
}
