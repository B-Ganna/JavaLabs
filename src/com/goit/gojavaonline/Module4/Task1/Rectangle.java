package com.goit.gojavaonline.module4.task1;



public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double countArea() {
        double area = sideA * sideB;

        return area;
    }
}
