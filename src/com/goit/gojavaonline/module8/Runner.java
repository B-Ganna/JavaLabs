package com.goit.gojavaonline.module8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Flower> bouquet = new ArrayList<>();
        bouquet.add(new Camomile("camomile", "white", 25, "medical"));
        bouquet.add(new Camomile("camomile", "yellow", 35, "medical"));
        bouquet.add(new Camomile("camomile", "pink", 15, "not medical"));

        //System.out.printf("%-14s%-14s%-11d%-6s%", bouquet);

        Comparator<Flower> comparator = new Comparator<Flower>() {
            @Override
            public int compare(Flower o1, Flower o2) {
                return o1.getPrice() - o2.getPrice();
            }
        };
        System.out.println(bouquet);
    }
}
