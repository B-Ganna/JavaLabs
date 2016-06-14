package com.goit.gojavaonline.Module4.Task3;


public class Main {
    public static void main (String[] args){
        Point a = new Point();
        System.out.println("Задайте координаты первой точки: ");
        a.inputPoint();

        Point b = new Point();
        System.out.println("Задайте координаты второй точки: ");
        b.inputPoint();

        System.out.println("Расстояние между точками: "+ b.getDistance(a));

    }
}
