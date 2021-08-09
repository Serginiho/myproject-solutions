package com.homecompany.chapter12.exercise27;

class ArrayException2 {
    public static void main (String[] args){
        Integer[] ia = {1, 2, 3, 4, 5};
        try{
            for (int i = 0; i < 6; i++) {
                System.out.println(ia[i]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Исключение поймано");
        }
    }
}
