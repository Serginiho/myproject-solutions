package com.homecompany.chapter11.exercise22;

class Word {
    static int totalCountW = 0;
    String s;
    int count;
    Word (String s, int count){
        this.s = s;
        this.count = count;
        totalCountW++;
    }
    @Override
    public String toString() {
        return s + "=" + count;
    }
}
