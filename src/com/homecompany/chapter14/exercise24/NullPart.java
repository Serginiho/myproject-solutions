package com.homecompany.chapter14.exercise24;

import com.homecompany.factory.Part;

public class NullPart extends Part {
    private static final Part NULL = new NullPart();
    public static class Factory implements com.homecompany.factory.Factory<NullPart> {
        @Override
        public NullPart create() {
            return (NullPart) NULL;
        }
    }
    @Override
    public String toString() {
        return "Null object";
    }
    private void g(){System.out.println("Private Method");}
    protected void f(){System.out.println("Protected Method");}
    void h(){System.out.println("Package access Method");}
}
