package com.goit.gojavaonline.module6.task1.module4Hw;

import java.util.Scanner;


public class Runner {

    public static double readDouble(String message) {
        while (true)

        {
            try {
                System.out.println(message);
                Scanner scanner = new Scanner(System.in);
                return scanner.nextDouble();
            } catch (Exception E) {
                System.out.println("Input is wrong");
            }
        }
    }

    public static void main(String[] args) {

        //вычисление площади треугольника
/*
        double x1 = 0;//readDouble("Enter coordinate X of Point A: ");
        double y1 = 0;//readDouble("Enter coordinate Y of Point A: ");
        double x2 = 0;//readDouble("Enter coordinate X of Point B: ");
        double y2 = 2;//readDouble("Enter coordinate Y of Point B: ");
        double x3 = 3;//readDouble("Enter coordinate X of Point C: ");
        double y3 = 0;//readDouble("Enter coordinate Y of Point C: ");


        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        Point c = new Point(x3, y3);

        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Triangle area " + triangle.countArea());
        */

        // вычисление площади прямоугольника

        double x4 = 0;
        double y4 = 0;
        double x5 = 0;
        double y5 = 2;
        double x6 = 0;
        double y6 = 0;
        double x7 = 3;
        double y7 = 0;


        Point e = new Point(x4, y4);
        Point f = new Point(x5, y5);
        Point g = new Point(x6, y6);
        Point h = new Point(x7, y7);

        Rectangle rectangle = null;
        try{
            rectangle = new Rectangle(1,2, 3,4, 6,5, 4,3);
        }
        catch (RectangleException ex){

        }
        System.out.println("Rectangle area: " + rectangle.countArea());



        //вычисление площади круга
        /*
        double x8 = 0;
        double y8 = 0;
        double x9 = 0;
        double y9 = 2;

        Point s = new Point(x8, y8);
        Point n = new Point(x9, y9);

        Circle circle = new Circle(s,n);
        System.out.println ("Circle area: "+ circle.countArea());

    }
*/


    }
}


