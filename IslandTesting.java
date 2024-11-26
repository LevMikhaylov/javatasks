package org.javatrain.is;


import org.island.*;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        IslandSimulation simulation = new IslandSimulation(100, 20);
        simulation.startSimulation();
        Island island = new Island(100, 20);
        try {
            Wolf wolf1 = new Wolf("Wolf1", 5, 3, 45, 0, 0);
            Wolf wolf2 = new Wolf("Wolf2", 5, 4, 45, 0, 0);
            Rabbit rabbit1 = new Rabbit("Rabbit1", 5, 45, 45, 1, 0);
            Rabbit rabbit2 = new Rabbit("Rabbit2", 5, 45, 45, 0, 1);
            Rabbit rabbit3 = new Rabbit("Rabbit3", 5, 45, 45, 1, 0);
            Fox fox = new Fox("Fox1", 5, 45, 45, 0, 2);
            Goat goat1 = new Goat("Goat",5,32,12,6,7);
            Hog hog1 = new Hog("Hog",4,12,4,5,5);
            Mouse mouse1 = new Mouse("Mouse",3,12,34,0,2);
            Horse horse1 = new Horse("Horse",4,3,12,0,2);
            Horse horse2 = new Horse("Horse",4,3,12,0,2);
            Island.addAnimalToCell(rabbit1, 0, 0);
            Island.addAnimalToCell(wolf1, 0, 0);
            Island.addAnimalToCell(wolf2, 0, 0);
            Island.addAnimalToCell(fox, 0, 0);
            Island.addAnimalToCell(rabbit1, 0, 0);
            Island.addAnimalToCell(rabbit2, 0, 0);
            Island.addAnimalToCell(rabbit3, 0, 0);
            Island.addAnimalToCell(goat1,0,0);
            Island.addAnimalToCell(hog1,0,0);
            Island.addAnimalToCell(mouse1,0,0);
            Island.addAnimalToCell(horse1,1,1);
            Island.addAnimalToCell(horse2,3,1);
            // Проверка на одной клетке и вызов метода eat
            Cell cell = island.getCell(0, 0);
            List<Animal> animals = cell.getAnimals();
            for (Animal animal : animals) {
                // Логика покушать
                if (animal instanceof Wolf) {
                    for (Animal prey : animals) {
                        if (prey instanceof Rabbit) {
                            animal.eat(prey);
                        } else if (prey instanceof Deer) {
                            animal.eat(prey);
                        } else if (prey instanceof Horse) {
                            animal.eat(prey);
                        }else if (prey instanceof Mouse) {
                            animal.eat(prey);
                        }else if (prey instanceof Goat) {
                            animal.eat(prey);
                        }else if (prey instanceof Sheep) {
                            animal.eat(prey);
                        }else if (prey instanceof Hog) {
                            animal.eat(prey);
                        }else if (prey instanceof Bull) {
                            animal.eat(prey);
                        }else if (prey instanceof Duck) {
                            animal.eat(prey);
                        }
                    }
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
}}
