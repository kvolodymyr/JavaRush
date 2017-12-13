package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<Horse>());
        game.getHorses().add(new Horse("Angel", 3, 0));
        game.getHorses().add(new Horse("Devil", 3, 0));
        game.getHorses().add(new Horse("God", 3, 0));
    }
}
