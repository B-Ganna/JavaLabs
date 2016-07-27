package com.goit.gojavaonline.module6.task2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        MusicShop musicShop = new MusicShop();

        ArrayList<Guitar> guitars = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            guitars.add(new Guitar());
        }
        musicShop.setGuitars(guitars);

        ArrayList<Piano> pianos = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            pianos.add(new Piano());
        }
        musicShop.setPianos(pianos);

        ArrayList<Pipe> pipes = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            pipes.add(new Pipe());
        }
        musicShop.setPipes(pipes);

        System.out.println(musicShop);

        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 7);
        order.put("pipe", 2);

        //int numberOfGuitarsToRemove = order.get("guitar");
        List<MusicInstruments> guitarsToRemove = prepareOrder(musicShop, order);
        List<MusicInstruments> pipesToRemove = prepareOrder(musicShop, order);

        System.out.println("Removed guitars: " + guitarsToRemove.size());
        System.out.println(musicShop);
    }

   public static List<MusicInstruments> prepareOrder(MusicShop musicShop, Map<String, Integer> order) {

        ArrayList<MusicInstruments> result = new ArrayList<>();

        List<Guitar> guitars = musicShop.getGuitars();
        int numberOfGuitarsToRemove = order.get("guitar");
        if (musicShop.getGuitars().size() < numberOfGuitarsToRemove) throw new IllegalArgumentException();

        List<Guitar> guitarsToRemove = musicShop.getGuitars().subList(0, numberOfGuitarsToRemove);
        List<Guitar> guitarsToStay = musicShop.getGuitars().subList(numberOfGuitarsToRemove, guitars.size());

        musicShop.setGuitars(guitarsToStay);
        result.addAll(guitarsToRemove);

        /*List<Pipe> pipes = musicShop.getPipes();
        int numberOfPipesToRemove = order.get("pipe");
        if (musicShop.getPipes().size() < numberOfPipesToRemove) throw new IllegalArgumentException();

        List<Pipe> pipesToRemove = musicShop.getPipes().subList(0, numberOfPipesToRemove);
        List<Pipe> pipesToStay = musicShop.getPipes().subList(numberOfPipesToRemove, pipes.size());

        musicShop.setPipes(pipesToStay);
        result.addAll(pipesToRemove);*/

        return result;

    }
}
