package com.homecompany.chapter13.exercise3;

import java.io.PrintStream;
import java.util.Formatter;

class Turtle {
    private String name;
    private Formatter f;
    Turtle (String name, Formatter f){
        this.name = name;
        this.f = f;
    }
    void move (int x, int y){
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }
    public static void main(String[] args){
        PrintStream outAlias = System.err;
        Turtle tommy = new Turtle("TOMMY", new Formatter(System.err));
        Turtle terry = new Turtle("TERRY", new Formatter(outAlias));
        tommy.move(1,2);
        terry.move(0,0);
        tommy.move(2,1);
        terry.move(1,1);
    }
}
