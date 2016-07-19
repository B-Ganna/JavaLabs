package com.goit.gojavaonline.module6.task1;


public class TemperatureUtils {
    public static double convertToC(double degreeF) throws TemperatureLimitException {
        while (degreeF > -459.67) {
            return (degreeF - 32) * 5 / 9;
        }
        throw new TemperatureLimitException("absolute Farengheit zero is -459.67!!");
    }

    public static double convertToF(double degreeC) throws TemperatureLimitException {
        while (degreeC > -273.15) {
            return (degreeC * 5 / 9) + 32;
        }
        throw new TemperatureLimitException("absolute Celius zero is -273.15!!");
    }
}
