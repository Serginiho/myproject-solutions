package com.homecompany.chapter10.exercise16;
//упражнение 16,17
class OutClass {
    class ClassInner{
        ClassInner(){
            System.out.println("ClassInner");
        }
        class ClassInner2{
            ClassInner2(){
                System.out.println("ClassInner2");
            }
        }
    }
    static class InnerClass {
        InnerClass (){
            System.out.println("InnerClass");
        }
        static class InnerClass2 {
            InnerClass2 (){
                System.out.println("InnerClass2");
            }
        }
    }
    public static void main (String[] args){
        InnerClass ic = new InnerClass();
        InnerClass.InnerClass2 ic2 = new InnerClass.InnerClass2();
        OutClass oc = new OutClass();
        ClassInner ci = oc.new ClassInner();
        ClassInner.ClassInner2 ci2 = ci.new ClassInner2();

    }
}
