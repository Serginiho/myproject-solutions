package com.homecompany.chapter7.сomposition;

public class SimpleClass2 {
    private SimpleClass1 sp1;
    private int i;
    SimpleClass2 (){
        i = 100;
    }

    @Override
    public String toString() {
        if (sp1 == null)
            sp1 = new SimpleClass1();
        return "SimpleClass2{" +
                "sp1=" + sp1 +
                '}' + " - " + i;
    }
    public static void main (String[] args){
        SimpleClass2 sp2 = new SimpleClass2();
        System.out.println(sp2);

    }

}
