package com.goit.gojavaonline.module8;


import java.util.Formatter;

public class Camomile extends Flower {
    private boolean medical;

    public Camomile(String name, String color, int price, boolean medical) {
        super(name, color, price);
        this.medical = medical;
    }

    public boolean getMedical() {
        return medical;
    }

   public String getSpecificField() {
      return String.valueOf(medical);
    }

    @Override
    protected Formatter title() {
        Formatter formatter = super.title();
        formatter.format("%25s", "Medical");
        return formatter;
    }
}
