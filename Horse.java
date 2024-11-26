package org.island;

public class Horse extends Herbivore{
    private final int weigth;
    public Horse(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Horse", health, hunger, reproductionChance, x, y);
        this.weigth=400;
    }
}
