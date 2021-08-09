package com.homecompany.factory;

public class FuelFilter extends Filter{
    public static class Factory
            implements com.homecompany.factory.Factory<FuelFilter> {
        @Override
        public FuelFilter create() { return new FuelFilter(); }
    }
}
