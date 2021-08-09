package com.homecompany.chapter9.exercise3;

class SubClassMac3 extends MyAbstractClass2 {
    @Override
    void method() {System.out.print(2);}
    public static void main(String[] args){
        MyAbstractClass2 mac = new SubClassMac3();
 //       ((SubClassMac3)mac).method();
        mac.method();
    }
}
