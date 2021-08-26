package com.homecompany.chapter21.exercise11;

class CopyInteger {
    private int a = 2;
    private int b = 2;

    synchronized void intIncrementA() {
        ++a;
        ++a;
    }

    synchronized void intIncrementB() {
        ++b;
        ++b;
    }

    synchronized void checkValid() {
          if(a % 2 !=0 || b % 2 != 0)
              throw new IllegalStateException();
    }

    public static void main(String[] args) {
        CheckCopyInteger.test(new CopyInteger(), 10);
    }
}
