package com.homecompany.chapter5;

public class VarArgs {
    static void g (String... args){
        for (String s: args)
            System.out.print(" " + s);
        System.out.println();
    }
}
