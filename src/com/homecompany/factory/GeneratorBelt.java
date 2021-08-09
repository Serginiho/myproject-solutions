package com.homecompany.factory;

public class GeneratorBelt extends Belt{
    public static class Factory
            implements com.homecompany.factory.Factory<GeneratorBelt> {
        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
