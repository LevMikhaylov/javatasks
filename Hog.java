package org.island;

public class Hog extends Herbivore{
    private final int weigth;
    public Hog(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super("Hog", health, hunger, reproductionChance, x, y);
        this.weigth=400;
    }
}
