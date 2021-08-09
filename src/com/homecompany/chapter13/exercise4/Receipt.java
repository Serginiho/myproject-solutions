package com.homecompany.chapter13.exercise4;

import java.util.Formatter;

class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private static final int COEFF = 6;
    private static final int FC = COEFF*3;
    private static final int SC = COEFF;
    private static final int TC = COEFF*2;
    private String s1 = "%-" + FC + "." + FC + "s %" + SC + "s %" + TC + "s\n";
    private String s2 = "%-" + FC + "." + FC + "s %" + SC + "d %" + TC + ".2f\n";
    private String s3 = "%-" + FC + "." + FC + "s %" + SC + "s %" + TC + ".2f\n";
    void printTitle (){
        f.format(s1, "Item", "Qty", "Price");
        f.format(s1, "----", "---", "-----");
    }
    void print (String name, int qty, double price){
        f.format(s2, name, qty, price);
        total+=price;
    }
    void printTotal (){
        f.format(s3, "Tax", "", total*0.06);
        f.format(s1, "", "", "-----");
        f.format(s3, "Total", "", total*1.06);

    }
    public static void main(String[] args){
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.10);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
