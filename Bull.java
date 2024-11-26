package org.island;

public class Bull extends Herbivore{
    private final int weight;
    public Bull(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Bull", health, hunger, reproductionChance, x, y);
        this.weight=700;
    }
}
