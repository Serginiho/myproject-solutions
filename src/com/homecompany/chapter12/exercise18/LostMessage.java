package com.homecompany.chapter12.exercise18;

public class LostMessage {
    public void f () throws VeryImportantException {
        throw new VeryImportantException();
    }
    public void g () throws SecondException {
        throw new SecondException();
    }
    public void dispose () throws ThirdException {
        throw new ThirdException();
    }
    public static void main (String[] args){
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
 //               try {
                    lm.g();
                }finally {
                    lm.dispose();
                }
 //           } catch (Exception e) {
  //              System.out.println(e);
 //           }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
