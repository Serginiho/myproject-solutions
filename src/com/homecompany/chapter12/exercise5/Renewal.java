package com.homecompany.chapter12.exercise5;

class Renewal {
    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            for (int i = 1; i < 10; i++) {
                try {
                    if (i < 5 && i>2) {
                        throw new Exception("Exception " + i);
                    } else {
                        f = false;
                        System.out.println(i);
                    }
                } catch (Exception e) {
                    e.printStackTrace(System.out);
                }
            }
        }
    }
}