package com.goit.gojavaonline.module4.task1;

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

            // вычисление площади прямоугольника

            Rectangle rectangle = new Rectangle(2,3);
            System.out.println ("Rectangle area: "+ rectangle.countArea());

            //вычисление площади круга

            Circle circle = new Circle(5);
            System.out.println ("Circle area: "+ circle.countArea());

        }





}


