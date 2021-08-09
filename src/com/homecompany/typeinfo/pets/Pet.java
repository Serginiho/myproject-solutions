package com.homecompany.typeinfo.pets;

public class Pet extends Individual {
    public Pet(String name) { super(name); }
    public Pet() { super(); }
    public void speak () {System.out.println(this + " " + "speak");}
}
