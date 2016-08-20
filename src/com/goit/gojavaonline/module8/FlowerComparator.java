package com.goit.gojavaonline.module8;


import java.util.Comparator;

public class FlowerComparator implements Comparator<Flower> {
    @Override
    public int compare(Flower o1, Flower o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
