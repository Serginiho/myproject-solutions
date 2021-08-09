package com.homecompany.chapter7.extend;

class Amphibian {
    protected void jump (Amphibian a){
        System.out.println(a + " " + "jump");
    }
    protected void voice (Amphibian b) {
        System.out.println(b+ " " + "voice");
    }
}
