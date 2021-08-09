package com.homecompany.chapter8.exercise5;

class RactangularGlyph extends Glyph{
    private Length length;
    private Width width;
    RactangularGlyph (){
        length = new Length();
        width = new Width();
        System.out.println("RactangularGlyph.RactangularGlyph(), length= " + length.lg + ", " + "width= " + width.wd);
    }

    @Override
    void draw() {
        System.out.println("RactangularGlyph.draw(), length= " + length.lg + ", " + "width= " + width.wd);
    }
}
