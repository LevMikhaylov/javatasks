package org.island;

import java.util.Random;

public class Herbivore extends Animal{
    public Herbivore(String name, int health, int hunger, int reproductionChance, int x, int y) {
        super(name, health, hunger, reproductionChance, x, y);
    }

    @Override
    public void eat(Animal plant) {
        // Implement eating behavior for herbivores
        Random random = new Random();
        int chance = random.nextInt(100);
        if (chance == 100) { // 100% chance to eat
            plant.health = 0; // Plant is eaten
            hunger = 0; // Herbivore is no longer hungry
            System.out.println(name + " has eaten " + plant.name);
        }
    }

    @Override
    public void reproduce() {
        // Reproduction logic
        Random random = new Random();
        if (random.nextInt(100) < reproductionChance) {
            System.out.println(name + " has reproduced!");
        }
    }

    @Override
    public void move(Island island) {
        if(isAlive()) {
            // Random movement logic
            int newX = x + (int) (Math.random() * 3) - 1; // Move -1, 0, or 1 in x direction
            int newY = y + (int) (Math.random() * 3) - 1; // Move -1, 0, or 1 in y direction
            if (island.isInBounds(newX, newY)) {
                x = newX;
                y = newY;
            }
        }
        System.out.println("Двигаться не могу");
    }

    @Override
    public void move(Animal animal, int i, int j) {
        if(isAlive()) {
            int newI = i + +(int) (Math.random() * 3) - 1;
            int newJ = j + +(int) (Math.random() * 3) - 1;
            Island.addAnimalToCell(animal, newI, newJ);
        }else{
            System.out.println("Двигаться не могу");
        }
    }
}
