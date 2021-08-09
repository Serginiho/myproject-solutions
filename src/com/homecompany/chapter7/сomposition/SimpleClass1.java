package com.homecompany.chapter7.сomposition;

class SimpleClass1 {
    private String s;
    SimpleClass1 (){
        System.out.println("SimpleClass1 ()");
        s = "сконструирован";
    }

    @Override
    public String toString() {
        return "SimpleClass1{" +
                "s='" + s + '\'' +
                '}';
    }
}
