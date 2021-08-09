package com.homecompany.chapter15.exercise21;

public class House extends Building{
    private String location;
    private int area;
    private String name;
    public House(){}
    public House (String l, int x){
        location = l;
        area = x;
    }
    public House (String l, String name, int x){
        this.name = name;
        location = l;
        area = x;
    }

    @Override
    public String toString() {
        return "House{ name='" + (name == null ? "": name) + '\''+
                ", location='" + location + '\'' +
                ", area=" + area +
                '}';
    }
}
