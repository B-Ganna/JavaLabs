package com.goit.gojavaonline.module5;


import java.util.Arrays;

import static com.goit.gojavaonline.module5.ArrayUtils.*;

public class Runner {

    public static void main(String[] args) {


        int[] array1 = new int[]{3, 9, 5, 2, 4, 6, 7};

        System.out.println("Minimum is: " + findMinimum(array1));
        System.out.println("Maximum is: " + findMaximum(array1));
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(array1)));
    }
}
