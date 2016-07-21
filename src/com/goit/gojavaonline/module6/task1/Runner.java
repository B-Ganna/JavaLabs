package com.goit.gojavaonline.module6.task1;


import static com.goit.gojavaonline.module6.task1.TemperatureUtils.convertToC;
import static com.goit.gojavaonline.module6.task1.TemperatureUtils.convertToF;


public class Runner {

    public static void main(String[] args) {

// конвертор температуры
        double c = 0;
        try {
            System.out.println("Temperature " + c + "C in Farengheit = " + convertToF(c));
        } catch (TemperatureLimitException e) {
            System.out.println("You entered following argument: " + c + "C." + e.getMessage());
        }

        double f = 0;
        try {
            System.out.println("Temperature " + f + "F in Celsius = " + convertToC(f));
        } catch (TemperatureLimitException e) {
            System.out.println("You entered following argument: " + f + "F." + e.getMessage());
        }

//площадь прямоугольника
        double a = 2;
        double b = 3;
        Rectangle rectangle = new Rectangle(a, b);

        final ArgumentValidator validator = new ArgumentValidator();
        try {
            validator.Validate(a, b);
            System.out.println("Rectangle square: " + rectangle.countArea());
        } catch (InvalidArgumentException ex) {
            System.out.println("You entered: " + ex.getSideA()+" and "+ex.getSideB()+". Rectangle's side can't be a negative argument!!");
        }
    }
}



