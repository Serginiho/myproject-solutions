package com.homecompany.factory;

public class CabinAirFilter extends Filter{
    public static class Factory
            implements com.homecompany.factory.Factory<CabinAirFilter> {
        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
