package com.goit.gojavaonline.module6.task1;


public class TemperatureUtils2 {
    public static double convertToC(double degreeF) {
        return (degreeF - 32) * 5 / 9;
    }

    public static double convertToF(double degreeC) {
        return (degreeC * 5 / 9) + 32;
    }

    public static void main(String[] args) throws TemperatureLimitException {
        double f = -990;
        double c = -990;

        if (f < -459.67) {
            try {
                throw new TemperatureLimitException();

            } catch (TemperatureLimitException e) {
                System.out.println("Absolute Farengheit zero is: - 459.67. Try again!");
                return;
            } finally {
                if (c > -273.15) {
                    System.out.println("Температура в градусах по Цельсию: " + convertToC(f));
                } else {
                    System.out.println("Absolute Celsius zero is: - 273.15. Try again!");
                }

            }
        }


        if (c < -273.15) {
            try {

                throw new TemperatureLimitException();
            } catch (TemperatureLimitException e) {
                System.out.println("Absolute Celsius zero is: - 273.15. Try again!");
                return;
            } finally {
                System.out.println("Температура в градусах по Фаренгейту: " + convertToF(c));

            }
        }
    }
}
