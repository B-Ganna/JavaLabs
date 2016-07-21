package com.goit.gojavaonline.module6.task1;


public class InvalidArgumentException extends RuntimeException {
    private final double sideA;
    private final double sideB;

    public InvalidArgumentException(final double sideA, final double sideB, final String msg) {
        super(msg);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
