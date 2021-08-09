package com.homecompany.chapter18.exercise30;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Line extends Shape{
    private static int color = RED;
    public static void
    serializeStaticState(ObjectOutputStream os)
            throws IOException { os.writeInt(color); }
    public static void
    deserializeStaticState(ObjectInputStream os)
            throws IOException { color = os.readInt(); }
    public Line(int xVal, int yVal, int dim) {
        super(xVal, yVal, dim);
    }
    @Override
    public void setColor(int newColor) { color = newColor; }
    @Override
    public int getColor() { return color; }
}
