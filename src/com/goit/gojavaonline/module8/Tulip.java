package com.goit.gojavaonline.module8;


public class Tulip extends Flower {
    private String country;

    public Tulip(String name, String color, int price, String country) {
        super(name, color, price);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
