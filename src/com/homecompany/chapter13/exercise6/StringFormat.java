package com.homecompany.chapter13.exercise6;

class StringFormat {
    private int i;
    private long l;
    private float f;
    private double d;
    StringFormat (int i, long l, float f, double d){
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("StringFormat: %s; i:%d; l:%,d; f:%.5f; d:%.2f", super.toString(),i,l,f,d);
    }
    public static void main(String[] args){
        StringFormat sf = new StringFormat(150,500000L,39.209f, 2.5);
        System.out.println(sf);
    }
}
