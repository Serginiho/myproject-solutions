package com.homecompany.chapter10.exercise12;

class VeryBadVampire {
    DangerousMonster getDM (){
        return new DangerousMonster(){
            @Override
            public void menace() {
                super.menace();
            }

            @Override
            void destroy() {
                super.destroy();
            }
        };
    }
    Vampire getV (){
        return new Vampire(){
            @Override
            public void kill() {
                super.kill();
            }

            @Override
            void drinkBlood() {
                super.drinkBlood();
            }
        };
    }

}
