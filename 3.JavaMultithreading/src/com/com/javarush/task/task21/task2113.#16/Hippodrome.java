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

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for(int i = 0; i < 10; i++ ) {
            System.out.println();
        }
    }

    public void run() throws InterruptedException {
        for(int i = 1; i <= 10; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public Horse getWinner() {
        Horse winner = null;
        double max = Double.MIN_VALUE;
        for(Horse horse : horses) {
            if (horse.getDistance() > max) {
                max = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner() {
        Horse winner = getWinner();
        System.out.println("Winner is " + winner.getName() + "!");
        // String name = winner.getName();
        // System.out.println("Winner is " + name.substring(0, 1).toUpperCase() + name.toLowerCase().substring(1) + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<Horse>());
        game.getHorses().add(new Horse("Angel", 3, 0));
        game.getHorses().add(new Horse("Devil", 3, 0));
        game.getHorses().add(new Horse("God", 3, 0));

        game.run();

        game.printWinner();
    }
}
