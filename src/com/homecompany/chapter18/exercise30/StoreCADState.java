package com.homecompany.chapter18.exercise30;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StoreCADState {
    public static void main(String[] args) throws Exception {
        List<Shape> shapes = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            shapes.add(Shape.randomFactory());
        for(int i = 0; i < 10; i++)
            shapes.get(i).setColor(Shape.GREEN);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("CADState.out"));
        Line.serializeStaticState(out);
        Square.serializeStaticState(out);
        Circle.serializeStaticState(out);
        out.writeObject(shapes);
        System.out.println(shapes);
    }
}
