package com.homecompany.chapter7.extend;

public class Frog extends Amphibian {
    @Override
    public void jump (Amphibian a){
        System.out.println(a + " " + "jump high");
        super.jump(a);
    }
    @Override
    public void voice (Amphibian b) {
        System.out.println(b+ " " + "voice loud");
        super.voice(b);
    }

    @Override
    public String toString() {
        return "Frog";
    }

    public static void main (String[] args){
        Frog frog = new Frog();
/*        Amphibian.jump(frog);
        Amphibian.voice(frog);*/
        frog.jump(frog);
        frog.voice(frog);
    }
}
