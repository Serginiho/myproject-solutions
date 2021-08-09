package com.homecompany.chapter10.exercise12;

class DragonZilla {
    DangerousMonster getDM(){
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
}
