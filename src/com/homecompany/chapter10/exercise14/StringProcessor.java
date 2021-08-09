package com.homecompany.chapter10.exercise14;

// упражнение 15
public abstract class StringProcessor implements Processor {
    @Override
    public String name(){
        return getClass().getSimpleName();
    }
    @Override
    public abstract String process(Object input);
    public static Apply apply (Processor p, Object s){
        return new Apply(){
            {System.out.println("Using Processor: " + p.name());
             System.out.println(p.process(s));}
        };
    }
    public static String s = "My name is Sergey";
    public static void main (String[] args){
        apply(new Upcase(), s);
        apply(new Downcase(), s);
        apply(new Splitter(), s);
        apply(new AdapterChangestr(), s);
    }
}
