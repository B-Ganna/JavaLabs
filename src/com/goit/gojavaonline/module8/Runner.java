package com.goit.gojavaonline.module8;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        List<Flower> bouquet = new ArrayList<>();

        bouquet.add(new Camomile("Camomile3", "white", 25, true));
        bouquet.add(new Camomile("Camomile2", "yellow", 35, false));
        bouquet.add(new Camomile("Camomile1", "pink", 15, false));

        bouquet.add(new Rose("Rose4", "white", 60, true));
        bouquet.add(new Rose("Rose2", "red", 65, false));
        bouquet.add(new Rose("Rose1", "yellow", 30, true));
        bouquet.add(new Rose("Rose3", "blue", 100, false));

        bouquet.add(new Tulip("Tulip2", "yellow", 35, "Holland"));
        bouquet.add(new Tulip("Tulip1", "white", 45, "Holland"));
        bouquet.add(new Tulip("Tulip3", "red", 25, "Ukraine"));

        FlowerComparator comparator = new FlowerComparator();
        TreeSet<Flower>sortedByName=new TreeSet<>(comparator);
        sortedByName.addAll(bouquet);

        TreeSet<Flower> sortedByPrice = new TreeSet<Flower>(((o1, o2) -> o2.getPrice() - o1.getPrice()));
        sortedByPrice.addAll(bouquet);

        System.out.println("Flowers unsorted: ");
        FlowerUtils.printTable(bouquet);
        System.out.println("\n"+"Sorted by Name: ");
        FlowerUtils.printTable(sortedByName);
        System.out.println("\n"+"Sorted by Price: ");
        FlowerUtils.printTable(sortedByPrice);





    }
}
