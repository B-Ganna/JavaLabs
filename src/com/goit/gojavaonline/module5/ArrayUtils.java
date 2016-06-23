package com.goit.gojavaonline.module5;

public class ArrayUtils {
    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    public static int[] bubbleSort(int[] array) {
        int[] cloneArray = array.clone();

        for (int i = 0; i < cloneArray.length - 1; i++) {
            for (int j = 0; j < cloneArray.length - 1 - i; j++) {
                if (cloneArray[j] > cloneArray[j + 1]) {
                    int temp = cloneArray[j];
                    cloneArray[j] = cloneArray[j + 1];
                    cloneArray[j + 1] = temp;
                }
            }
        }
        return cloneArray;
    }


    // TODO: 20.06.2016 выяснить как клонировать массив


    // // TODO: 20.06.2016 найти и вернуть мин значение массива; читать про работу с массивам;  скалярные ссылочные типы

}

