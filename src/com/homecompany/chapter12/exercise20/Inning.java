package com.homecompany.chapter12.exercise20;

abstract class Inning {
    Inning () throws BaseballException {}
    void event () throws BaseballException {}
    abstract void atBat () throws Strike, Foul;
    void walk () {}
    abstract void run () throws UmpireException;
}
