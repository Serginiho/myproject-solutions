package com.homecompany.factory;

public class PowerSteeringBelt extends Belt{
    public static class Factory
            implements com.homecompany.factory.Factory<PowerSteeringBelt> {
        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
