package com.homecompany.chapter14.exercise3;

class ShapesTest {
    public static void main(String[] args){
        Object obj = new Rhomboid();
        Shape shape = (Shape) obj;
        System.out.println(obj);
        ((Shape) obj).draw();
        Rhomboid r = (Rhomboid) shape;
        System.out.println(r);
//        Circle c = (Circle) r; // не возможно провести преобразовнаие
    }
}
