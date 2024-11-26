package org.island;

public class Duck extends Herbivore{
    private final int weigth;
    public Duck(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Duck", health, hunger, reproductionChance, x, y);
        this.weigth=1;
    }
}
