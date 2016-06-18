package com.goit.gojavaonline.module4.task3;


public class PointDistanceCounter {

    public double countDistance(Point first, Point second){
        double distanceX = Math.pow(first.getX ()-second.getX (), 2);
        double distanceY = Math.pow(first.getY ()-second.getY (), 2);

        return Math.sqrt( distanceX+ distanceY);
    }
}
