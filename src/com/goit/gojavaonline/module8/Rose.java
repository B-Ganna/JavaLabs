package com.goit.gojavaonline.module8;

public class Rose extends Flower {
    private String aroma;

    public Rose(String name, String color, int price, String aroma) {
        super(name, color, price);
        this.aroma = aroma;
    }

    public String getAroma() {
        return aroma;
    }
}
