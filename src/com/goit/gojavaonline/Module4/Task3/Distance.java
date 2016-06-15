package com.goit.gojavaonline.Module4.Task3;


import java.awt.*;
import java.util.Scanner;

public class Distance {
    public static void main (String[] args){
        double x;
        double y;

        Point a = new Point();
        System.out.println("Задайте координаты первой точки: ");
        x = new Scanner(System.in).nextDouble();
        y = new Scanner(System.in).nextDouble();

        Point b = new Point();
        System.out.println("Задайте координаты второй точки: ");
        x = new Scanner(System.in).nextDouble();
        y = new Scanner(System.in).nextDouble();

        System.out.println("Расстояние между точками A и B :" + Math.sqrt( Math.pow(b.x-a.x, 2)+ Math.pow(b.y-a.y, 2)));



    }
}
