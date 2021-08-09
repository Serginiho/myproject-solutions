package com.homecompany.chapter15.exercise20;

class ThirdPartyClass<T extends InterFace> {
    private T obj;
    public ThirdPartyClass (T x) {
        obj = x;
    }
    public void getMethod ()  {
        obj.methodA();
        obj.methodB();
    }

    public static void main(String[] args) {
        ResultClass rc = new ResultClass();
        ThirdPartyClass<ResultClass> tpc = new ThirdPartyClass<>(rc);
        tpc.getMethod();
    }
}
