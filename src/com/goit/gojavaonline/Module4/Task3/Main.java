package com.goit.gojavaonline.module4.task3;

import java.util.Scanner;

public class Main {
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


        double Xpoint1 = readDouble("Enter coordinate X of Point first: ");
        double Ypoint1 = readDouble("Enter coordinate Y of Point first: ");
        double Xpoint2 = readDouble("Enter coordinate X of Point second: ");
        double Ypoint2 = readDouble("Enter coordinate Y of Point second: ");


        Point first = new Point(Xpoint1, Ypoint1);
        Point second = new Point(Xpoint2, Ypoint2);

        PointDistanceCounter pointDistanceCounter = new PointDistanceCounter();
        double distance = pointDistanceCounter.countDistance(first, second);

        System.out.println("Distance between two Points: " + distance);
    }
}