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

            double XpointA = 0;//readDouble("Enter coordinate X of Point A: ");
            double YpointA = 0;//readDouble("Enter coordinate Y of Point A: ");
            double XpointB = 0;//readDouble("Enter coordinate X of Point B: ");
            double YpointB = 2;//readDouble("Enter coordinate Y of Point B: ");
            double XpointC = 3;//readDouble("Enter coordinate X of Point C: ");
            double YpointС = 0;//readDouble("Enter coordinate Y of Point C: ");


            Point a = new Point(XpointA, YpointA);
            Point b = new Point(XpointB, YpointB);
            Point c = new Point(XpointC, YpointС);

            Triangle triangle = new Triangle(a,b,c);
            System.out.println("Triangle area " + triangle.countArea());
        }


    }


