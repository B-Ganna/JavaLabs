package com.goit.gojavaonline.Module4.Task1;


import java.util.Scanner;

public class Circle {
    public  static void main (String[] args){
        double radius;

        System.out.println("Введите радиус круга: ");
        radius = new Scanner(System.in).nextDouble();

        System.out.println("Площадь круга равна: " + Math.PI*Math.pow(radius, 2));

    }
}
