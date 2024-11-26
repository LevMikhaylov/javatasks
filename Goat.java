package org.island;

public class Goat extends Herbivore{
    private final int weight;

    public Goat(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Goat", health, hunger, reproductionChance, x, y);
        this.weight=60;
    }
}
