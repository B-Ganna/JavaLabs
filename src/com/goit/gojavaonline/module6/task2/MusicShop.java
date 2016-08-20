package com.goit.gojavaonline.module6.task2;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class MusicShop {


    private List<MusicInstruments> musicInstruments = new ArrayList<>();

    public MusicShop(List<MusicInstruments> musicInstruments) {
        this.musicInstruments = musicInstruments;
    }

    public boolean validate(final String name, final int number) throws OutOfStockException, InstrumentDoesNotExist {
        for (MusicInstruments instruments : musicInstruments) {
            String instrumentName = instruments.getType();
            if (instrumentName.equals(name)) {
                if (number > 0 && number <= countByName(name)) {
                    return true;
                } else {
                    throw new OutOfStockException(name, number);
                }
            }
        }
        throw new InstrumentDoesNotExist(name);
    }


    private List<MusicInstruments> selectInstruments(final String name, final int number) {
        int counter = number;
        List<MusicInstruments> selected = new ArrayList<>();
        for (MusicInstruments instruments : musicInstruments) {
            String currentName = instruments.getType();
            if (counter == 0) {
                break;
            } else if (currentName.equals(name)) {
                selected.add(instruments);
                counter--;
            }
        }
        return selected;
    }


    public List<MusicInstruments> prepareInstruments(Map<String, Integer> order) {
        List<MusicInstruments> instrumentsToRemove = new ArrayList<>();
        Set<String> names = order.keySet();
        for (String name : names) {
            if (validate(name, order.get(name))) {
                instrumentsToRemove.addAll(selectInstruments(name, order.get(name)));
            }
            musicInstruments.removeAll(instrumentsToRemove);
        }
        return instrumentsToRemove;
    }

    public String showInstruments() {
        String instrumentString = "";
        int count = 0;
        int sameNames = 1;
        while (count < musicInstruments.size() - 1) {
            if (musicInstruments.get(count).getType().equals(musicInstruments.get(count + 1).getType())) {
                sameNames++;
            } else {
                instrumentString += musicInstruments.get(count).getType() + ": " + sameNames + ", ";
                sameNames = 1;
            }
            count++;
        }
        instrumentString += musicInstruments.get(count - 1).getType() + ": " + sameNames + ", ";
        return instrumentString;
    }

    private int countByName(String name) {
        int count = 0;
        for (MusicInstruments instruments : musicInstruments) {
            if (instruments.getType().equals(name)) {
                count++;
            }
        }
        return count;
    }
    private static long getNumberOfGuitars(List<MusicInstruments> readyOrder) {
        return readyOrder.stream()
                .filter(new Predicate<MusicInstruments>() {
                    @Override
                    public boolean test(MusicInstruments musicInstruments) {
                        return musicInstruments.getType().equals("guitar");
                    }
                })
                .count();
    }
}
