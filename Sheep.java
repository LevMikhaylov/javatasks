package org.island;

public class Sheep extends Herbivore{
    private final int wegth;

    public Sheep(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Sheep", health, hunger, reproductionChance, x, y);
        this.wegth=70;
    }

}
