package com.homecompany.factory;

public class OilFilter extends Filter{
    public static class Factory
            implements com.homecompany.factory.Factory<OilFilter> {
        @Override
        public OilFilter create() { return new OilFilter(); }
    }
}
