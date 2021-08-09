package com.homecompany.chapter19.exercise3;

public class Meals {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Course course:
                 Course.values()) {
                 Food food = course.randomSelection();
                 System.out.println(food);
            }
            System.out.println("---------");
        }
    }
}
