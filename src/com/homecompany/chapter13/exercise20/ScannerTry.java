package com.homecompany.chapter13.exercise20;

import java.util.Scanner;

class ScannerTry {
    int i;
    long l;
    float f;
    double d;
    String s;
    ScannerTry (String s){
        Scanner scanner = new Scanner(s);
        this.s = scanner.nextLine();
        this.i = scanner.nextInt();
        this.d = scanner.nextDouble();
        this.l = scanner.nextLong();
        this.f = scanner.nextFloat();
    }

    @Override
    public String toString() {
        return "ScannerTry{" +
                "i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", s='" + s + '\'' +
                '}';
    }
    public static void main(String[] args){
        ScannerTry st = new ScannerTry("Sergey\n 35 2,7 3502 10000,345");
        System.out.println(st);
    }
}
