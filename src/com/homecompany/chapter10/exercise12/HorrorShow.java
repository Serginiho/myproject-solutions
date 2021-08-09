package com.homecompany.chapter10.exercise12;

public class HorrorShow {
    static void u(Monster b){
        b.menace();
    }
    static void v(DangerousMonster d){
        d.destroy();
        d.menace();
    }
    static void w(Lethal l){
        l.kill();
    }
    public static void main (String[] args){
        DragonZilla barney = new DragonZilla();
        u(barney.getDM());
        v(barney.getDM());
        VeryBadVampire vlad = new VeryBadVampire();
        u(vlad.getDM());
        v(vlad.getDM());
        w(vlad.getV());
    }

}
