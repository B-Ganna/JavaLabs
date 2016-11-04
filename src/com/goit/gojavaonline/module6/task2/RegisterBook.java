package com.goit.gojavaonline.module6.task2;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RegisterBook {
    private Map<String, Integer> book = new HashMap();



    public static void increaseInstrumentNumber(MusicInstruments instrument) {



    }


    public static void printBook(HashMap<String, Integer> book) {
        Set<Map.Entry<String, Integer>> set = book.entrySet();
        for (Map.Entry<String, Integer> instruments : set) {
            System.out.println("Instruments in stock: " + instruments.getKey() + ", in amount " + instruments.getValue());
        }

    }
}


//private ArrayList<MusicInstruments> instrumentsInBook = new ArrayList<>();

    /*public List<MusicInstruments> addInstrument(String name) {
        List<MusicInstruments> addedToStock = new ArrayList<>();
        for (MusicInstruments instruments : instrumentsInBook) {
            String instrumentName = instruments.getType();
            if (instrumentName.equals(name)) {
                addedToStock.add(instruments);
            }
        }
        return addedToStock;
    }*/
