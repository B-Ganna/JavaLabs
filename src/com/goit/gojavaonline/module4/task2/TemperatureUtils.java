package com.goit.gojavaonline.module4.task2;


public class TemperatureUtils {
    public static double convertToC(double degreeF) {
        return (degreeF - 32) * 5 / 9;
    }

    public static double convertToF(double degreeC) {

        return (degreeC * 5 / 9) + 32;
    }

    public static void main(String[] args)  {
        double f = 0;
        double c = 0;

        System.out.println("Температура в градусах по Фаренгейту: " + convertToF(c));

        System.out.println("Температура в градусах по Цельсию: " + convertToC(f));

    }
}
