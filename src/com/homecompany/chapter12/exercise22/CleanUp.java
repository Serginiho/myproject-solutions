package com.homecompany.chapter12.exercise22;

class CleanUp {
    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor("/Users/serginiho/IdeaProjects/myproject/src/com/homecompany/twelfthchapter/exercise22/CleanUp.java");
            try {
                String s;
                int i=1;
                while ((s= fc.getLine())!=null){
                    System.out.println(i + " " + s);
                    i++;
                }
            } catch (Exception e) {
                System.out.println("Exception in main");
                e.printStackTrace();
            }finally {
                fc.dispose();
            }
        } catch (Exception e) {
            System.out.println("Fail in constructor");
            e.printStackTrace(System.out);
        }
    }
}