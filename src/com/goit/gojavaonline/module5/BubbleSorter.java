package com.goit.gojavaonline.module5;


public class BubbleSorter {
    public int [] bubbleSort (int[]numbers){
        int i, j, temp = 0;
        for (i = 0; i<numbers.length-1;i++){
            for (j = 0; j<numbers.length-1-i; j++){
              if (numbers[j]>numbers[j+1]){
                  temp=numbers[j];
                  numbers[j] = numbers[j+1];
                  numbers[j+1] = temp;
              }
            }
        }
        return numbers;
    }
}
