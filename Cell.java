package org.island;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private static int countWolfs = 0;
    private static int countDeers = 0;
    private static int countFoxes = 0;
    private static int countSnakes = 0;
    private static int countBears = 0;
    private static int countHorses = 0;
    private static int countRabbits = 0;
    private static int countMice = 0;
    private static int countGoats = 0;
    private static int countSheep = 0;
    private static int countHogs = 0;
    private static int countBulls = 0;
    private static int countDucks = 0;
    private static int countCaterpillars = 0;
    private List<Animal> animals;
    private List<Plant> plants;

    public Cell() {
        this.animals = new ArrayList<>();
        this.plants = new ArrayList<>();
    }

    public synchronized void addAnimal(Animal animal) throws Exception {
        if (animal instanceof Wolf) {
            countWolfs++;
            if (countWolfs > 30) {
                throw new Exception("Слишком много волков в этой клетке!");
            }
        }
        else if (animal instanceof Deer) {
            countDeers++;
            if (countDeers > 20) {
                throw new Exception("Слишком много оленей в этой клетке!");
            }
        }
        else if (animal instanceof Fox) {
            countFoxes++;
            if (countFoxes > 30) {
                throw new Exception("Слишком много лис в этой клетке!");
            }
        }
        else if (animal instanceof Snake) {
            countSnakes++;
            if (countSnakes > 30) {
                throw new Exception("Слишком много змей в этой клетке!");
            }
        }
        else if (animal instanceof Fox) {
            countFoxes++;
            if (countFoxes > 30) {
                throw new Exception("Слишком много лис в этой клетке!");
            }
        }
        else if (animal instanceof Bear) {
            countBears++;
            if (countBears > 5) {
                throw new Exception("Слишком много медведей в этой клетке!");
            }
        }
        else if (animal instanceof Horse) {
            countHorses++;
            if (countHorses > 20) {
                throw new Exception("Слишком много лошадей в этой клетке!");
            }
        }
        else if (animal instanceof Rabbit) {
            countRabbits++;
            if (countRabbits > 150) {
                throw new Exception("Слишком много кроликов в этой клетке!");
            }
        }
        else if (animal instanceof Mouse) {
            countMice++;
            if (countMice > 500) {
                throw new Exception("Слишком много мышей в этой клетке!");
            }
        }
        else if (animal instanceof Goat) {
            countGoats++;
            if (countGoats > 140) {
                throw new Exception("Слишком много коз в этой клетке!");
            }
        }
        else if (animal instanceof Sheep) {
            countSheep++;
            if (countSheep > 140) {
                throw new Exception("Слишком много овец в этой клетке!");
            }
        }
        else if (animal instanceof Hog) {
            countHogs++;
            if (countHogs > 50) {
                throw new Exception("Слишком много кабанов в этой клетке!");
            }
        }
        else if (animal instanceof Bull) {
            countBulls++;
            if (countBulls > 10) {
                throw new Exception("Слишком много буйволов в этой клетке!");
            }
        }
        else if (animal instanceof Duck) {
            countDucks++;
            if (countDucks > 200) {
                throw new Exception("Слишком много уток в этой клетке!");
            }
        }
        else if (animal instanceof Caterpillar) {
            countCaterpillars++;
            if (countCaterpillars > 1000) {
                throw new Exception("Слишком много гусениц в этой клетке!");
            }
        }
        animals.add(animal);
    }


    public int getCountWolfs() {
        return countWolfs;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }
}
