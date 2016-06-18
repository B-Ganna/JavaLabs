package com.goit.gojavaonline.module4.task3;

import java.awt.*;
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


        double coordXpoint1 = readDouble("Enter coordinate X of Point first: ");
        double coordYpoint1 = readDouble("Enter coordinate Y of Point first: ");
        double coordXpoint2 = readDouble("Enter coordinate X of Point second: ");
        double coordYpoint2 = readDouble("Enter coordinate Y of Point second: ");


        Point first = new Point(coordXpoint1, coordYpoint1);
        Point second = new Point(coordXpoint2, coordYpoint2);

        PointDistanceCounter pointDistanceCounter = new PointDistanceCounter();
        double distance = pointDistanceCounter.countDistance(first, second);

        System.out.println("Distance between two Points: " + distance);
    }
}