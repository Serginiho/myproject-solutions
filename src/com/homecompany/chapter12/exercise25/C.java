package com.homecompany.chapter12.exercise25;

class C extends B{
    @Override
    void methodA() throws ThirdException {
        System.out.println("Method class C");
        throw new ThirdException();
    }
    public static void main (String[] args){
        A a = new C();
        try {
            a.methodA();
        }catch (FirstException e1){
            e1.printStackTrace();
        }
    }
}
