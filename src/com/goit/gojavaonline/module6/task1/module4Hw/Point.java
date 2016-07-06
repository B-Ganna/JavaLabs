package com.goit.gojavaonline.module6.task1.module4Hw;


public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double countDistanceTo(Point point) {
        double distanceX = Math.pow(this.x - point.getX(), 2);
        double distanceY = Math.pow(this.y - point.getY(), 2);
        double distance = Math.sqrt(distanceX + distanceY);

        return distance;
    }
}





