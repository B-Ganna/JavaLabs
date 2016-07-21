package com.goit.gojavaonline.module4.task1;


public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        if (null == a || null == b || null == c) {
            throw new NullPointerException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getPointA() {
        return a;
    }

    public Point getPointB() {
        return b;
    }

    public Point getPointC() {
        return c;
    }


    public double countArea() {

        double ab = a.countDistanceTo(b);
        double bc = b.countDistanceTo(c);
        double ac = a.countDistanceTo(c);


        double halfPerimeter = (ab + bc + ac) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - ab) * (halfPerimeter - bc) * (halfPerimeter - ac));


        return area;
    }

    public static void ValidateTriangleSide(double ab, double bc, double cd) {
        if (ab < 0 || bc < 0 || cd < 0) {
            throw new IllegalArgumentException();
        }
    }
}
