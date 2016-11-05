package com.goit.gojavaonline.module8;


import java.util.Formatter;

public class Tulip extends Flower {
    private String country;

    public Tulip(String name, String color, int price, String country) {
        super(name, color, price);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getSpecificField() {
        return country;
    }

    @Override
    protected Formatter title() {
        Formatter formatter = super.title();
        formatter.format("|%10.10s", "Country");
        return formatter;
    }
}
