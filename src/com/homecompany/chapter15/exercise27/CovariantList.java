package com.homecompany.chapter15.exercise27;

import java.util.ArrayList;
import java.util.List;

class CovariantList {
    public static void main(String[] args) {
        List<? extends Number> numbers = new ArrayList<Integer>();
//        numbers.add(2); //Не возможно, так как int не подходит под тип параметра ? extends Number
//        numbers.add((Number) 2) // аналогично предыдущему
        numbers.add(null);
        Number x = numbers.get(0);
    }
}
