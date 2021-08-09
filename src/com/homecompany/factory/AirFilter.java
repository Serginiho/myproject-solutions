package com.homecompany.factory;

public class AirFilter extends Filter{
    public static class Factory
            implements com.homecompany.factory.Factory<AirFilter> {
        @Override
        public AirFilter create() { return new AirFilter(); }
    }
}
