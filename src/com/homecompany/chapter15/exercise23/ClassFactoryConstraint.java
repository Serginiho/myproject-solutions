package com.homecompany.chapter15.exercise23;

class ClassFactoryConstraint {
    public static void main(String[] args) {
        Foo<Integer> f1 = new Foo<Integer>(new IntegerFactory(), 4);
        System.out.println(f1);
        Foo<Widget> f2 = new Foo<Widget>(new Widget.WidgetFactory(), 50);
        System.out.println(f2);
    }
}
