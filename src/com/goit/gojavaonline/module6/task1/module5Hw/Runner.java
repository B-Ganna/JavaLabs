package com.goit.gojavaonline.module6.task1.module5Hw;


import java.util.Scanner;



public class Runner {
    int size;

    public static void main(String[] args) {

        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        Array array = new Array(array1);

        if (size < 0) {
            try {
                throw new NegativeArraySizeException();
            } catch (NegativeArraySizeException e) {
                System.out.println("Array size cannot be negative!!");
            }
        }
        System.out.println("Enter array elements: ");
        int i;
        for (i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }
        if (array1[i] < 0) {
            try {
                throw new ArrayIndexOutOfBoundsException("Negative numbers are not allowed!!");
            } catch (ArrayIndexOutOfBoundsException e) {
            }

            System.out.println("New array:" + array);
            System.out.println("Minimum is: " + array.findMinimum());
            System.out.println("Maximum is: " + array.findMaximum());
            array.sort();
            System.out.println("Sorted array: " + array);

        }

    }
}