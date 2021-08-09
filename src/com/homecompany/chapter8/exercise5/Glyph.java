package com.homecompany.chapter8.exercise5;

class Glyph {
    void draw (){
        System.out.println("Glyph.draw()");
    }
    Glyph (){
        System.out.println("Glyph перед вызовом draw()");
        draw();
        System.out.println("Glyph после вызовом draw()");
    }
}
