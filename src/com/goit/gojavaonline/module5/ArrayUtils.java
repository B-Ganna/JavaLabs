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
        int[] b = array.clone();
            int i = 0;
            int j = 0;
            int temp = 0;
            for (i = 0; i<b.length-1;i++){
                for (j = 0; j<b.length-1-i; j++){
                    if (b[j]>b[j+1]){
                        temp=b[j];
                        b[j] = b[j+1];
                        b[j+1] = temp;
                    }
                }
            }
            return b;
        }



    // TODO: 20.06.2016 выяснить как клонировать массив


        // // TODO: 20.06.2016 найти и вернуть мин значение массива; читать про работу с массивам;  скалярные ссылочные типы

    }

