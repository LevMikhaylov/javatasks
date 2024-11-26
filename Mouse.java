package org.island;

public class Mouse extends Herbivore{
    private final double weight;
    public Mouse(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Mouse", health, hunger, reproductionChance, x, y);
        this.weight=0.05;
    }
}
