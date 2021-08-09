package com.homecompany.chapter4;

public class Choice {
    public static void main (String [] args){
        for (int i = 0; i<=10; i++)
            switch (i) {
                case 0:
                    System.out.println("Это");
                    break;
                case 1:
                    System.out.println("урок");
                    break;
                case 2:
                    System.out.println("java");
                    break;
                case 3:
                    System.out.println("по");
                    break;
                case 4:
                    System.out.println("циклам");
                    break;
                case 5:
                    System.out.println("выборам");
                    break;
                case 6:
                    System.out.println("управляющим констуркциям");
                    break;
                case 7:
                    System.out.println("for");
                    break;
                case 8:
                    System.out.println("else-if");
                    break;
                case 9:
                    System.out.println("while");
                    break;
                case 10:
                    System.out.println("switch");
                    break;
                default:
                    System.out.println("Где break?");
                    break;
            }
    }
}
