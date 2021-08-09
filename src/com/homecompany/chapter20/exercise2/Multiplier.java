package com.homecompany.chapter20.exercise2;

import com.organization.annotationprocessor.extract.ExtractInterface;

@ExtractInterface("IMultiplier")
public class Multiplier {
    public int multiply(int x, int y) {
        int total = 0;
        for(int i = 0; i < x; i++)
            total = add(total, y);
        return total;
    }
    private int add(int x, int y) { return x + y; }
    public static void main(String[] args) {
        Multiplier m = new Multiplier();
        int x = 20, y = 16;
        System.out.format("%s*%s = %s", x , y , m.multiply(x, y));
    }
}
