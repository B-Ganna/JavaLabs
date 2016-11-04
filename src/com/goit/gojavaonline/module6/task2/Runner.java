package com.goit.gojavaonline.module6.task2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        List<MusicInstruments> musicInstruments = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            musicInstruments.add(new Piano("piano"));
        }
        for (int i = 0; i < 16; i++) {
            musicInstruments.add(new Guitar("guitar"));
        }
        for (int i = 0; i < 7; i++) {
            musicInstruments.add(new Guitar("trumpet"));
        }

        RegisterBook rb = new RegisterBook();


        MusicShop musicShop = new MusicShop(musicInstruments);
        Map<String, Integer> order = new HashMap<>();
        System.out.println("Now in stock: " + musicShop.showInstruments() + "\n");

        try {
            List<MusicInstruments> readyOrder;
            order.put("guitar", 7);
            order.put("trumpet", 2);
            readyOrder = musicShop.prepareInstruments(order);

            long numberOfGuitars = getNumberOfGuitars(readyOrder);
            long numberOfTrumpets = getNumberOfTrumpets(readyOrder);
            System.out.println("Your order: guitar: " + numberOfGuitars + ", " + "trumpet: " + numberOfTrumpets);
            order.clear();
            System.out.println("Now in stock: " + musicShop.showInstruments() + "\n");


            order.put("piano", 1);

            readyOrder = musicShop.prepareInstruments(order);
            long numberOfPianos = getNumberOfPianos(readyOrder);

            System.out.println("Your order: piano: " + numberOfPianos);
            order.clear();
            System.out.println("Now in stock: " + musicShop.showInstruments() + "\n");
            order.clear();

            order.put("piano", 1);
            order.put("guitar", 9);
            order.put("trumpet", 6);
            readyOrder = musicShop.prepareInstruments(order);
            System.out.println("Your order: " + readyOrder);
            System.out.println("Now in stock: " + musicShop.showInstruments() + "\n");
            order.clear();
        } catch (OutOfStockException ex) {
            System.out.println("Item " + ex.getName() + ", in an amount of " + ex.getNumber() + " is out of stock!" + "\n" + " Correct your order!");
        } catch (InstrumentDoesNotExist ex) {
            System.out.println("Instrument does not exist: " + ex.getName());
        }
    }

    private static long getNumberOfPianos(List<MusicInstruments> readyOrder) {
        return readyOrder.stream()
                .filter(MusicInstruments -> MusicInstruments.getType().equals("piano"))
                .count();
    }

    private static long getNumberOfTrumpets(List<MusicInstruments> readyOrder) {
        return readyOrder.stream()
                .filter(MusicInstruments -> MusicInstruments.getType().equals("trumpet"))
                .count();
    }

    private static long getNumberOfGuitars(List<MusicInstruments> readyOrder) {
        return readyOrder.stream()
                .filter(MusicInstruments -> MusicInstruments.getType().equals("guitar"))
                .count();
    }

}

