package com.goit.gojavaonline.module6.task2;


abstract class MusicInstruments {
    private String name;

    public MusicInstruments(String name) {
        this.name = name;
    }

    public String getType() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

