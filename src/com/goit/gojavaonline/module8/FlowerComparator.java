package com.goit.gojavaonline.module8;


import java.util.Comparator;

public class FlowerComparator implements Comparator<Flower> {
    @Override
    public int compare(Flower o1, Flower o2) {
        if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else if (o1.getName().equals(o2.getName())) {
            return 0;
        } else {
            return 1;
        }
    }
}
