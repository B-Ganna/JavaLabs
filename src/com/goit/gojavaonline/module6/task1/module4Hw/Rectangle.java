package com.goit.gojavaonline.module6.task1.module4Hw;




public class Rectangle {

    private Point e;
    private Point f;
    private Point g;
    private Point h;


    public  Rectangle (Point e, Point f, Point g, Point h) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    public Point getPointE() {
        return e;
    }
    public Point getPointF() {
        return f;
    }
    public Point getPointG() {
        return g;
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
