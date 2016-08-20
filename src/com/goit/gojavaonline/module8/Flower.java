package com.goit.gojavaonline.module8;


import java.util.Formatter;

public class Flower {
    protected String name;
    protected String color;
    protected int price;

    public Flower(String name, String color, int price) {
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

    public int nameComparator(Flower o) {
        return this.price - o.price;

    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    protected Formatter getHeader() {
        Formatter formatter = new Formatter();
        formatter.format("%20.20s", "Name");
        formatter.format("%20.20s", "Size");
        return formatter;
    }
    public int compareTo(Flower o){
        return this.price - o.price;
    }
}
