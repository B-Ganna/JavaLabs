package com.goit.gojavaonline.module4.task1.triangle;


import com.goit.gojavaonline.module4.task1.triangle.Point;
import com.goit.gojavaonline.module4.task1.triangle.TriangleMeasurer;


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


        double XpointA = readDouble("Enter coordinate X of Point A: ");
        double YpointA = readDouble("Enter coordinate Y of Point A: ");
        double XpointB = readDouble("Enter coordinate X of Point B: ");
        double YpointB = readDouble("Enter coordinate Y of Point B: ");
        double XpointC = readDouble("Enter coordinate X of Point C: ");
        double YpointC = readDouble("Enter coordinate Y of Point C: ");


        Point a = new Point(XpointA, YpointA);
        Point b = new Point(XpointB, YpointB);
        Point c = new Point(XpointB, YpointB);



        TriangleMeasurer triangleMeasurer = new TriangleMeasurer();

        double square = triangleMeasurer.triangleSurfaceMeasure (Ab, Ab, Bc);

        System.out.println("Triangle's square: " + square);
    }


}
