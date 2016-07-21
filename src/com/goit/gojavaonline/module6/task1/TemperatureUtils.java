package com.goit.gojavaonline.module6.task1;


public class TemperatureUtils {
    public final static double ABSOLUTE_ZERO_IN_KELVIN = 0;
    public final static double ABSOLUTE_ZERO_IN_FARENGHEIT = 0;
    public final static double ABSOLUTE_ZERO_IN_CELSIUS = 0;

    public static double convertToC(double degreeF) {

        if (degreeF < ABSOLUTE_ZERO_IN_FARENGHEIT) {
            throw new TemperatureLimitException(" This argument is less than absolute minimum temperature in Farengheit!");
        }
        return (degreeF - 32) * 5 / 9;
    }

    public static double convertToF(double degreeC) throws TemperatureLimitException {
        if (degreeC < ABSOLUTE_ZERO_IN_CELSIUS) {
            throw new TemperatureLimitException(" This argument is less than absolute minimum temperature in Celsius!");
        }
        return (degreeC * 5 / 9) + 32;

    }
}
