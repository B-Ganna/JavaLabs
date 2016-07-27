package com.goit.gojavaonline.module6.task2;


import java.util.List;

public class MusicShop {
    List<Guitar> guitars;
    List<Piano> pianos;
    List<Pipe> pipes;

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public List<Piano> getPianos() {
        return pianos;
    }

    public void setPianos(List<Piano> pianos) {
        this.pianos = pianos;
    }

    public List<Pipe> getPipes() {
        return pipes;
    }

    public void setPipes(List<Pipe> pipes) {
        this.pipes = pipes;
    }

    @Override
    public String toString() {
        return "MusicShop{" +
                "guitars=" + guitars.size() +
                ", pianos=" + pianos.size() +
                ", pipes=" + pipes.size() +
                '}';
    }


}
