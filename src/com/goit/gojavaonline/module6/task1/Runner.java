package com.goit.gojavaonline.module6.task1;


import static com.goit.gojavaonline.module6.task1.TemperatureUtils.convertToC;
import static com.goit.gojavaonline.module6.task1.TemperatureUtils.convertToF;


public class Runner {

    public static void main(String[] args) {

//массив
        int[] array1 = new int[]{3, 9, 5, 2, 4, 6, 7};
        Array array = new Array(array1);
        try {
            System.out.println("Исходный массив: " + array);
            System.out.println("Minimum is: " + array.findMinimum());
            System.out.println("Maximum is: " + array.findMaximum());
            array.sort();
            System.out.println("Sorted array: " + array);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Sorry, index is out of bounds!!");
        }

// конвертор температуры
        double c = 0;
        try {
            System.out.println("Температура в градусах по Фаренгейту: " + convertToF(c));
        } catch (TemperatureLimitException e) {
            System.out.println("Incorrect argument: " + e.getMessage());
        }

        double f = 0;
        try {
            System.out.println("Температура в градусах по Фаренгейту: " + convertToC(f));
        } catch (TemperatureLimitException e) {
            System.out.println("Incorrect argument: " + e.getMessage());
        }

    }
}



