package com.homecompany.chapter12.exercise28;

class MyRTException extends RuntimeException{
    String s;
    public MyRTException(){}
    public MyRTException(String msg){
        super(msg);
        this.s = msg;
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
