package com.homecompany.factory;

public class FanBelt extends Belt{
    public static class Factory
            implements com.homecompany.factory.Factory<FanBelt> {
        @Override
        public FanBelt create() { return new FanBelt(); }
    }
}
