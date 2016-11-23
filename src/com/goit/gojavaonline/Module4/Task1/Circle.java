package com.goit.gojavaonline.module4.task1;


public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double countArea() {
        double area;
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
