package com.homecompany.chapter11.exercise27;

class Command {
    private String s;
    Command (String s){
        this.s = s;
    }
    void operation () {
        System.out.println(s);
    }
}
