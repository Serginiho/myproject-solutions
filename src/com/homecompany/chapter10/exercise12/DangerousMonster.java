package com.homecompany.chapter10.exercise12;

class DangerousMonster implements Monster{
    void destroy(){System.out.println("destroy");};
    @Override
    public void menace() {
        System.out.println("menace");
    }
}
