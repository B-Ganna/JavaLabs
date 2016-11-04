package com.goit.gojavaonline.module8;


import java.util.Formatter;

public class Flower {
    protected String name;
    protected String color;
    protected int price;

    protected Flower(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getSpecificField() {
        return "Error!";
    }


    protected Formatter title() {
        Formatter formatter = new Formatter();
        formatter.format("%25s", "Name");
        formatter.format("%25s", "Color");
        formatter.format("%25s", "Price");
        return formatter;
    }

    //public int compareTo(Flower o) {
     //   return this.price - o.price;
    //}

}
