package com.homecompany.chapter11.exercise31;

import com.homecompany.chapter8.exercise2.*;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Random;

public class IterableRandomShapeGenerator implements Iterable<Shape> {
    private Random rnd = new Random();
   /* public Shape next (){
        switch (rnd.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rhombus();
        }
    }*/

    @NotNull
    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<>() {
            private int countShape = 0;
            @Override
            public boolean hasNext() {
                return countShape < CallShapes.s.length;
            }

            @Override
            public Shape next() {
                switch (rnd.nextInt(4)) {
                    default:
                    case 0: countShape++; return new Circle();
                    case 1: countShape++; return new Square();
                    case 2: countShape++; return new Triangle();
                    case 3: countShape++; return new Rhombus();
                }
            }
        };
    }
}
