package org.island;

public class Rabbit extends Herbivore{
    private final int weight;
    public Rabbit(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Rabbit", health, hunger, reproductionChance, x, y);
        this.weight=2;
    }
}
