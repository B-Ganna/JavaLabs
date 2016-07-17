package com.goit.gojavaonline.module6.task1;


public class RunnerArray {

    public static void main(String[] args) throws IndexOutOfBoundsException {


        int[] array1 = new int[]{3, 9, 5, 2, 4, 6, 7};

        Array array = new Array(array1);

        System.out.println("Исходный массив: " + array);
        System.out.println("Minimum is: " + array.findMinimum());
        System.out.println("Maximum is: " + array.findMaximum());
        array.sort();
        System.out.println("Sorted array: " + array);
    }
}


