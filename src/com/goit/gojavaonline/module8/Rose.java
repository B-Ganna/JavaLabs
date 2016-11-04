package com.goit.gojavaonline.module8;

import java.util.Formatter;

public class Rose extends Flower {
    private boolean aroma;

    public Rose(String name, String color, int price, boolean aroma) {
        super(name, color, price);
        this.aroma = aroma;
    }

    public boolean getAroma() {
        return aroma;
    }

    public String getSpecificField() {
        return String.valueOf(aroma);
    }

    @Override
    protected Formatter title() {
        Formatter formatter = super.title();
        formatter.format("%25s", "Aroma");
        return formatter;
    }
}
