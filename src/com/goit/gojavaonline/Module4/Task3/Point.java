package com.goit.gojavaonline.Module4.Task3;


import java.util.Scanner;

public class Point {

    double x1, y1, x2, y2;

    //void init (double x1, double y1, double x2, double y2){
     //this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;}

    void inputPoint(){
        Scanner point = new Scanner(System.in);
        System.out.print("Введите x1: ");
        double x1 = point.nextDouble();
        System.out.print("Введите y1: ");
        double y1 = point.nextDouble();

        System.out.print("Введите x2: ");
        double x2 = point.nextDouble();
        System.out.print("Введите y2: ");
        double y2 = point.nextDouble();

    }
    double getDistance(a){
        return Math.sqrt( Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
    }


}
