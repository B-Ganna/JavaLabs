package com.goit.gojavaonline.module4.task1;



public class Circle {
    private Point s;
    private Point n;

    public Circle(Point s, Point n) {
        this.s = s;
        this.n = n;
    }

    public Point getPointS() {
        return s;
    }

    public Point getPointN() {
        return n;
    }

    public double countArea() {
        double radius = s.countDistanceTo(n);

        double area = Math.PI * Math.pow(radius, 2);

        return area;
    }
}
