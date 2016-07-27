package com.goit.gojavaonline.module6.task1;


public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        Rectangle.validate(sideA, sideB);
        this.sideA = sideA;
        this.sideB = sideB;

    }

    private static void validate(double sideA, double sideB) {
        if (sideA < 0 || sideB < 0) {
            throw new InvalidArgumentException(sideA, sideB, "Rectangle's side can't be a negative agrument!!");
        }
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
