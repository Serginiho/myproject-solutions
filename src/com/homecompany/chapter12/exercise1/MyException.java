package com.homecompany.chapter12.exercise1;

class MyException {
    public static void main(String[] args){
        try{
            throw new Exception("Исключение");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }finally {
            System.out.println("Исключение поймано");
        }
    }
}
