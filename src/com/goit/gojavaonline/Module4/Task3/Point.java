package com.goit.gojavaonline.Module4.Task3;


import java.util.Scanner;

public class Point {

    double x, y;


   void inputPoint(){
      Scanner point = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = point.nextDouble();
        System.out.print("Введите y: ");
        double y = point.nextDouble();

    }


    double getDistance(Point a){
       return Math.sqrt( Math.pow(x-a.x, 2)+ Math.pow(y-a.y, 2));
   }


}
