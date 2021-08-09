package com.homecompany.chapter20.exercise2;

import com.organization.annotationprocessor.extract.ExtractInterface;

@ExtractInterface("IDivider")
public class Divider {
    public int division (int x, int y){
        int c;
        for (c = 0; x >= y; c++) {
            x = x - y;
        }
        return c;
    }
    public static void main(String[] args) {
        Divider d = new Divider();
        int a = 320, b = 16;
        System.out.format("%s divide %s: %s", a, b, d.division(a, b));
    }
}
