package com.homecompany.chapter12.exercise19;

import com.homecompany.chapter12.exercise18.LostMessage;

class NotLostMessage {
    public static void main (String[] args){
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
                try {
                lm.g();
            }finally {
                lm.dispose();
            }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
