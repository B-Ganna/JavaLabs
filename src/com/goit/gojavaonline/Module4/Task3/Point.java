package com.goit.gojavaonline.Module4.Task3;


import java.util.Scanner;

public class Point {
    double x;
    double y;

    void printPoint(){
        System.out.println("("+x+";"+y+")");
    }
    void setPoint(double a, double b){
        x=a;
        y=b;
    }
    void setPoint(double a){
        x=a;
        y=a;
    }
    void inputPoint(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Введите Х: ");
        double a = inp.nextDouble();
        System.out.print("Введите Y: ");
        double b = inp.nextDouble();

        setPoint(a,b);
    }

    double getDistance(Point a){
        return Math.sqrt( Math.pow(x-a.x, 2)+ Math.pow(y-a.y, 2));
    }
    double getRadius(){
        Point a = new Point(0,0);
        return this.getDistance(a);
    }
    Point(){
        x =0;
        y =0;
    }
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}
