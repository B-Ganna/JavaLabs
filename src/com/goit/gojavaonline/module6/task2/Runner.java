package com.goit.gojavaonline.module6.task2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

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

        MusicShop musicShop = new MusicShop(musicInstruments);
        Map<String, Integer> order = new HashMap<>();
        System.out.println("Now in stock: " + musicShop.showInstruments() + "\n");

        try {
            List<MusicInstruments> readyOrder;
            order.put("guitar", 7);
            order.put("trumpet", 2);
            readyOrder = musicShop.prepareInstruments(order);

            long numberOfGuitars = readyOrder.stream()
                    .filter(new Predicate<MusicInstruments>() {
                        @Override
                        public boolean test(MusicInstruments musicInstruments) {
                            return musicInstruments.getType().equals("guitar");
                        }
                    })
                    .count();

            long numberOfTrumpets = readyOrder.stream()
                    .filter(new Predicate<MusicInstruments>() {
                        @Override
                        public boolean test(MusicInstruments musicInstruments) {
                            return musicInstruments.getType().equals("trumpet");
                        }
                    })
                    .count();

            System.out.println("Your order: guitar: " + numberOfGuitars + ", " + "trumpet: " + numberOfTrumpets);
            order.clear();
            System.out.println("Now in stock: " + musicShop.showInstruments() + "\n");


            order.put("piano", 1);
            readyOrder = musicShop.prepareInstruments(order);
            long numberOfPianos = readyOrder.stream()
                    .filter(new Predicate<MusicInstruments>() {
                        @Override
                        public boolean test(MusicInstruments musicInstruments) {
                            return musicInstruments.getType().equals("piano");
                        }
                    })
                    .count();

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
}

