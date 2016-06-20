package com.goit.gojavaonline.module5;


import java.util.Arrays;

public class Runner {

    public static void Main(String[] args) {

        QuickSorter quickSorter = new QuickSorter();
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] numbers1 = new int[]{3, 9, 5, 2, 4, 6, 7};

        System.out.println("Minimum is: " + quickSorter.searchMin(numbers1));
        System.out.println("Maximum is: " + quickSorter.searchMax(numbers1));
        System.out.println("Sorted array: " + Arrays.toString(bubbleSorter.bubbleSort(numbers1)));
    }
}
