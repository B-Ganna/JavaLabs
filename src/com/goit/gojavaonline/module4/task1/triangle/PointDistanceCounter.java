package com.goit.gojavaonline.module4.task1.triangle;

public class PointDistanceCounter {
    public void countDistance(Point a, Point b, Point c) {
        double distanceAbX = Math.pow(a.getX() - b.getX(), 2);
        double distanceAbY = Math.pow(a.getY() - b.getY(), 2);

        double distanceAcX = Math.pow(a.getX() - c.getX(), 2);
        double distanceAcY = Math.pow(a.getY() - c.getY(), 2);

        double distanceBcX = Math.pow(b.getX() - c.getX(), 2);
        double distanceBcY = Math.pow(b.getY() - c.getY(), 2);


        double Ab = Math.sqrt(distanceAbX + distanceAbY);
        double Ac = Math.sqrt(distanceAcX + distanceAcY);
        double Bc = Math.sqrt(distanceBcX + distanceBcY);

    }
}
