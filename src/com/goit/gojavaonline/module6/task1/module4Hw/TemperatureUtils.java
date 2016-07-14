package com.goit.gojavaonline.module6.task1.module4Hw;


import java.util.Scanner;

public class TemperatureUtils {
    public static double convertToC(double degreeF) {
        return (degreeF - 32) * 5 / 9;
    }

    public static double convertToF(double degreeC) {
        return (degreeC * 5 / 9) + 32;
    }

    public static double readDouble(String message) throws RuntimeException {
        while (true) {
            try {
                System.out.println();
                Scanner scanner = new Scanner(System.in);
                return scanner.nextDouble();

            } catch (RuntimeException e) {
                System.out.println("Input is wrong! Only integers are allowed!! ");
                System.out.print("Try again: ");
            }

        }
    }


    public static void main(String[] args)throws RuntimeException {

        System.out.print("Enter Celsius degree: ");
        double c = readDouble("Enter Celsius degree: ");
        System.out.print("Enter Farengeit degree: ");
        double f = readDouble("Enter Farengeit degree: ");

        System.out.println("Температура в градусах по Фаренгейту: " + convertToF(c));
        System.out.println("Температура в градусах по Цельсию: " + convertToC(f));

    }
}
