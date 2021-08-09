package com.homecompany.chapter3;

public class Dog {
    String name, says;
    public static void main (String[] arg){
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "spot";
        d1.says ="ARW-ARW";
        d2.name = "scruffy";
        d2.says = "GAV-GAV";
        System.out.println("This is " + d1.name + ". " + "He says: " + d1.says);
        System.out.println("This is " + d2.name + ". " + "He says: " + d2.says);
        Dog d3 = new Dog();
        d3 = d1;
//        d3.name = d1.name;
//        d3.says = d2.says;
        System.out.println(d3 == d1);
        System.out.println(d3 == d2);
        System.out.println(d2 == d1);
        System.out.println(d3.equals(d1));
        System.out.println(d3.hashCode());
        System.out.println(d1.hashCode());
        System.out.println(d3.hashCode() == d1.hashCode());
        System.out.println(d3.name + " " + d3.says);

    }

}
