package com.goit.gojavaonline.module6.task1;


public class TemperatureUtils2 {
    public static double convertToC(double degreeF) {
        return (degreeF - 32) * 5 / 9;
    }

    public static double convertToF(double degreeC) {
        return (degreeC * 5 / 9) + 32;
    }

    public static void main(String[] args) throws TemperatureLimitException {
        double f = 0;
        double c = 0;

        if (f < -459.67) {
            try {
                throw new TemperatureLimitException();

            } catch (TemperatureLimitException e) {
                System.out.println("Absolute Farengheit zero is: - 459.67. Can't find Celsius!");
                return;
            } finally {
                if (c > -273.15) {
                    System.out.println("Farengheit temperature: " + convertToF(c));

                } else {
                    System.out.println("Absolute Celsius zero is: - 273.15. Can't find Farengheit!");
                }
            }
        }


        if (c < -273.15) {
            try {

                throw new TemperatureLimitException();
            } catch (TemperatureLimitException e) {
                System.out.println("Absolute Celsius zero is: - 273.15. Can't find Farengheit!");
                return;
            } finally {
                if (f > -459.67) {
                    System.out.println("Celsius temperature: " + convertToC(f));
                } else {
                    System.out.println("Absolute Farengheit zero is: - 459.67. Can't find Celsius!");
                }
            }
        }
        System.out.println("Celsius temperature: " + convertToC(f));
        System.out.println("Farengheit temperature: " + convertToF(c));
    }
}
