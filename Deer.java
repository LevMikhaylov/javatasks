package org.island;

public class Deer extends Herbivore{
    private final int weight;
    public Deer(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super(name, health, hunger, reproductionChance, x, y);
        this.weight=300;
    }
}
