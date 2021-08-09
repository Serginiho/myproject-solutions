package com.homecompany.chapter12.exercise6;

class TestExc {
    public static void main(String[] args){
        try{
            throw new Exception1();
        } catch (Exception ignored) {}
        try {
            throw new Exception1();
        } catch (Exception ignored) {}
    }
}
