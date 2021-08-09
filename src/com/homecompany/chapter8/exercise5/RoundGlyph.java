package com.homecompany.chapter8.exercise5;

class RoundGlyph extends Glyph {
    private int radius = 0;
    RoundGlyph (int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
