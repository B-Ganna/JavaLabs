package com.goit.gojavaonline.module6.task2;


public class OutOfStockException extends RuntimeException {
    private String name;
    private int number;

    public OutOfStockException(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
