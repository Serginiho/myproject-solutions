package com.homecompany.chapter15.exercise23;

class Widget {
    private int arg;
    private Widget (int arg) {
        this.arg = arg;
    }
    public static class WidgetFactory implements FactoryI<Widget>{

        @Override
        public Widget create(int arg) {
            return new Widget(arg);
        }
    }
    @Override
    public String toString() {
        return "Widget{" +
                "arg=" + arg +
                '}';
    }
}
