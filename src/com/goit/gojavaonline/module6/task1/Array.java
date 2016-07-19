package com.goit.gojavaonline.module6.task1;


import java.util.Arrays;

public class Array {
    private int[] numbers;

    public Array(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }

    public int findMinimum() throws  IndexOutOfBoundsException {
        int min = 0;
            min = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (min > numbers[i])
                    min = numbers[i];
            }
        return min;
    }

    public int findMaximum() throws IndexOutOfBoundsException{
        int max = 0;
            max = numbers[0];

            for (int i = 0; i < numbers.length; i++) {
                if (max < numbers[i])
                    max = numbers[i];
            }

        return max;
    }

    public void sort() {

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
