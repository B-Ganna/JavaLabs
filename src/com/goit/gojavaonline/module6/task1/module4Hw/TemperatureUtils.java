package com.goit.gojavaonline.module6.task1.module4Hw;


import java.util.Scanner;

public class TemperatureUtils {
    public static double convertToC(double degreeF) {
        return (degreeF - 32) * 5 / 9;
    }

    public static double convertToF(double degreeC) {
        return (degreeC * 5 / 9) + 32;
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println();
                Scanner scanner = new Scanner(System.in);
                return scanner.nextDouble();

            } catch (Exception E) {
                System.out.println("Input is wrong");
            }

        }
    }


    public static void main(String[] args) {
        double c = readDouble("Enter Celsius degree: ");
        double f = readDouble("Enter Farengeit degree: ");

        System.out.println("Температура в градусах по Фаренгейту: " + convertToF(c));
        System.out.println("Температура в градусах по Цельсию: " + convertToC(f));

    }
}
