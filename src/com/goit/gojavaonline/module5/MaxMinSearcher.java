package com.goit.gojavaonline.module5;


public class MaxMinSearcher {
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
        for (int i = 0; i < numbers.length; i++) {
            if (max > numbers[i])
                max = numbers[i];
        }
        return max;
    }

    public static void Main(String[] args) {

        MaxMinSearcher maxMinSearcher  = new MaxMinSearcher();
        int[]numbers1 = new int[]{3,9,5,2,4,6};

        System.out.println(maxMinSearcher.searchMin(numbers1));
        System.out.println(maxMinSearcher.searchMax(numbers1));
     }

}
