package com.goit.gojavaonline.module4.task1;



public class Rectangle {

    private Point e;
    private Point f;
    private Point h;


    public  Rectangle (Point e, Point f, Point h) {
        this.e = e;
        this.f = f;
        this.h = h;
    }
    public Point getPointE() {
        return e;
    }
    public Point getPointF() {
        return f;
    }
    public Point getPointH() {
        return h;
    }


    public double countArea() {
        double ef = e.countDistanceTo(f);
        double eh = e.countDistanceTo(h);


        double area = ef *  eh;

        return area;
    }
}
