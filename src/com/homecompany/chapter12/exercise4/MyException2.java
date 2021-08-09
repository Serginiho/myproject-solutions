package com.homecompany.chapter12.exercise4;

public class MyException2 extends Exception{
    String s;
    public MyException2 (){}
    public MyException2 (String msg){
        super(msg);
        this.s = msg;
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
