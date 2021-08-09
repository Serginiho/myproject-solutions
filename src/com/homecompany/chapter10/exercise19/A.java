package com.homecompany.chapter10.exercise19;

class A {
    U getU(){
        return new U() {
            @Override
            public void f() {
                System.out.println("Реализация f() в А" + A.this.toString().hashCode());
            }

            @Override
            public void g() {
                System.out.println("Реализация g() в А" + A.this.toString().hashCode());
            }

            @Override
            public void h() {
                System.out.println("Реализация h() в А" + A.this.toString().hashCode());
            }
        };
    }
}
