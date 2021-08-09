package com.homecompany.chapter12.exercise16;

class Shape {
    Shape(int i) { System.out.println("Shape constructor"); }
    void dispose() { System.out.println("Shape dispose"); }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }
    @Override
    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }
    @Override
    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line: " + start + ", " + end);
    }
    @Override
    void dispose() {
        System.out.println("Erasing Line: " + start + ", " + end);
        super.dispose();
    }
}
public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    CADSystem(int i) {
        super(i + 1);
        for(int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j*j);
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combined constructor");
    }
    @Override
    public void dispose() {
        System.out.println("CADSystem.dispose()");
        // The order of cleanup is the reverse
        // of the order of initialization:
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }
    static void makeCADS(int i){
        CADSystem cs = new CADSystem(i);
        try {
            if (i == 2) return;
            System.out.println("Выход в точке 2");
        }finally {
            System.out.println("Завершающие действия");
            cs.dispose();
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            makeCADS(i);
        }
 /*       CADSystem x = new CADSystem(3);
        try {
            System.out.println("В блоке try выход на середине");
            for (int i = 0; i < 4; i++){
                System.out.println(i);
                if (i == 2) return;}
        } finally {
            System.out.println("Завершающие действия");
            x.dispose();
        }*/
    }
}
