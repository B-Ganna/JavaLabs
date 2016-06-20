package com.goit.gojavaonline.module5;


public class QuickSorter {

    public int searchMin (int[]numbers) {

        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (min < numbers[i])
                min = numbers[i];
        }
        return min;
    }

    public int searchMax (int[]numbers) {

        int max = 0;
        for (int i = 0; i > numbers.length; i++) {
            if (max > numbers[i])
                max = numbers[i];
        }
        return max;
    }
}
