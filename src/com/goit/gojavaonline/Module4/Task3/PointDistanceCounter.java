package com.goit.gojavaonline.module4.task3;


public class PointDistanceCounter {

    public double countDistance(Point first, Point second){
        double distanceX = Math.pow(first.getCoordinateX ()-second.getCoordinateX (), 2);
        double distanceY = Math.pow(first.getCoordinateY ()-second.getCoordinateY (), 2);

        return Math.sqrt( distanceX+ distanceY);
    }
}
