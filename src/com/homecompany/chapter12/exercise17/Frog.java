package com.homecompany.chapter12.exercise17;

class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
    protected void dispose() {
        System.out.println("disposing Characteristic " + s);
    }
}

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }
    protected void dispose() {
        System.out.println("disposing Description " + s);
    }
}

class LivingCreature {
    private Characteristic p =
            new Characteristic("is alive");
    private Description t =
            new Description("Basic Living Creature");
    LivingCreature() {
        System.out.println("LivingCreature()");
    }
    protected void dispose() {
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic p =
            new Characteristic("has heart");
    private Description t =
            new Description("Animal not Vegetable");
    Animal() { System.out.println("Animal()"); }
    @Override
    protected void dispose() {
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p =
            new Characteristic("can live in water");
    private Description t =
            new Description("Both water and land");
    Amphibian() {
        System.out.println("Amphibian()");
    }
    @Override
    protected void dispose() {
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");
    public Frog() { System.out.println("Frog()"); }
    @Override
    protected void dispose() {
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        Frog frog = new Frog();
        boolean f = true;
        try {
            while (f) {
                for (int i = 0; i < 10; i++) {
                    if (i == 5) {
                        f = false;
                        System.out.println("Выход на середине цикла");
                        break;
                    }
                }
            }
  /*      }catch (Exception e){
            frog.dispose();
        }*/ // Не гарантирует завершающих действий

        }finally {
            System.out.println("Завершающие действия");
            frog.dispose();
        }
    }
}
