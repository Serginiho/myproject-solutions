package com.homecompany.chapter10.exercise17;
//упражение 18
interface ClassInInterface {
    void f();
    class InterfaceClass {
        InterfaceClass (){
            System.out.println("Class in interface");
        }
    }
    class Test implements ClassInInterface{

        @Override
        public void f() {

        }
        public static void main(String[] args){
            InterfaceClass interc = new InterfaceClass();
        }
    }
}
