package com.homecompany.chapter9.exercise5;
// упражнение 11
public abstract class StringProcessor implements Processor{
    @Override
    public String name(){
        return getClass().getSimpleName();
    }
    @Override
    public abstract String process (Object input);
    public static String s = "My name is Sergey";
    public static void main (String[] args){
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
        Apply.process(new AdapterChangestr(), s);
    }
}
