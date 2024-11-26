package org.island;

public abstract class Animal {
    protected String name;
    protected int health;
    protected int hunger;
    protected int reproductionChance;
    protected int x, y;

    public Animal(String name, int health, int hunger, int reproductionChance, int x, int y) {
        this.name = name;
        this.health = health;
        this.hunger = hunger;
        this.reproductionChance = reproductionChance;
        this.x = x;
        this.y = y;
    }

    public abstract void eat(Animal prey);
    public abstract void reproduce();
    public abstract void move(Island island);
    public abstract void move(Animal animal, int i, int j);

    public boolean isAlive() {
        return health > 0;
    }

    public void updateHunger() {
        hunger++;
        if (hunger > 10) { // If hunger exceeds 10, the animal dies
            health = 0;
        }
    }

    public void printStatus() {
        System.out.println(name + " at (" + x + ", " + y + ") - Health: " + health + ", Hunger: " + hunger);
    }

    public String getName() {
        return name;
    }
}
