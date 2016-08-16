package com.goit.gojavaonline.module6.task2;


public class InstrumentDoesNotExist extends RuntimeException {
    private String name;

    public InstrumentDoesNotExist(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
