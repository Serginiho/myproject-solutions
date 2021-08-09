package com.homecompany.chapter8.exercise2;

import com.homecompany.chapter11.exercise31.IterableRandomShapeGenerator;

//упражнения 2 - 4
public class CallShapes {
    public static Shape[] s;
    CallShapes (int size){
        s = new Shape[size];
    }
    private static IterableRandomShapeGenerator irsg = new IterableRandomShapeGenerator();
    public static void main (String[] args){
        CallShapes cs = new CallShapes(8);
        for (int i=0;i<s.length;i++)
            s[i] = irsg.iterator().next();
        for (Shape shp: s)
            shp.draw();
        for (Shape shp: s)
            shp.erase();
        for (Shape shp: s)
            shp.edit();
    }
}
