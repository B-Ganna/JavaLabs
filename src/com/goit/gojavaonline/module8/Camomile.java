package com.goit.gojavaonline.module8;


public class Camomile extends Flower {
    private String medical;

    public Camomile(String name, String color, int price, String medical) {
        super(name, color, price);
        this.medical = medical;
    }

    public String isMedical() {
        return medical;
    }


}
