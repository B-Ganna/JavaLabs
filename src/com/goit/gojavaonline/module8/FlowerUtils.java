package com.goit.gojavaonline.module8;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;
import java.util.Iterator;

public abstract class FlowerUtils {

    public static void printTable(Collection<Flower> collection) {
        Iterator<Flower> iterator = collection.iterator();
        ArrayList<String> classNames = new ArrayList<>();
        while (iterator.hasNext()) {
            String className = iterator.next().getClass().getName();
            if (!classNames.contains(className)) {
                System.out.println("\n" + iterator.next().title());
                printFlowers(collection, className);
                classNames.add(className);
            }
        }
    }

    private static void printFlowers(Collection<Flower> flowers, String className) {
        for (Flower flower : flowers) {
            String currentClassName = flower.getClass().getName();
            if (currentClassName.equals(className)) {
                printCurrentFlower(flower);
            }
        }
    }

    private static void printCurrentFlower(Flower element) {
        Formatter formatter = new Formatter();
        formatter.format("|%10.10s", element.getName());
        formatter.format("|%10.10s", element.getColor());
        formatter.format("|%10.10s", element.getPrice());
        formatter.format("|%10.10s|", element.getSpecificField());
        System.out.println(formatter);
    }
}
