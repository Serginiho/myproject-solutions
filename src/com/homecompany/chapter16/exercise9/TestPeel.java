package com.homecompany.chapter16.exercise9;

class TestPeel {
    public static void main(String[] args) {
//        Peel<Banana>[] peels = new Peel<Banana>[10]; // не допустимо
        Peel<Banana> peel = new Peel<>();
        for (int i = 0; i < 10; i++) {
            peel.add(new Banana());
        }
        System.out.println(peel);
    }
}
