package org.island;

public final class Plant {
    private String name;
    public int health;
    private int heigth;
    private final int weigth;
    public Plant(String name) {
        this.name = name;
        this.health = 10; // Initial health of the plant
        this.heigth=0;
        this.weigth=1;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void grow() {
        ++heigth;
        health++;
    }
}
