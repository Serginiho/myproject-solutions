package com.homecompany.chapter6;

public class SixthChapterClass {
     int a, b, g;
    private String s = "Шестая глава";
    public SixthChapterClass (){
        System.out.println(s);
    }
    String show () {
        return s;
    }
    public String show2 () {
        return s;
    }
    protected String show3 () {
        return s;
    }
}
class SixthChapterClass2 {
    public SixthChapterClass2 () {}
    public void sum (){
        SixthChapterClass scc = new SixthChapterClass();
        int k=0;
        k = scc.a + scc.b;
        System.out.println(k);
    }

}