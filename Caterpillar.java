package org.island;

public class Caterpillar extends Herbivore{
    private final double weigth;
    public Caterpillar(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Caterpillar", health, hunger, reproductionChance, x, y);
        this.weigth=0.01;
    }
}
