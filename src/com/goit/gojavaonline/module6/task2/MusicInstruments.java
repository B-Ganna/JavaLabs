package com.goit.gojavaonline.module6.task2;


abstract class MusicInstruments {
    public abstract String getType();

    @Override
    public String toString() {
        return "MusicInstruments{}"+getType();
    }
}
