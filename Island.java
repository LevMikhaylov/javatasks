package org.island;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Island {
    private static final int WIDTH = 100;
    private static final int HEIGHT = 20;
    private static Cell[][] grid;
    private ScheduledExecutorService scheduler;

    public Island(int width, int height) {
        grid = new Cell[WIDTH][HEIGHT];
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                grid[i][j] = new Cell();
            }
        }
        scheduler = Executors.newScheduledThreadPool(1);
        startSimulation();
    }

    public void startSimulation() {
        scheduler.scheduleAtFixedRate(this::updateSimulation, 0, 1, TimeUnit.SECONDS);
    }

    private void updateSimulation() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                Cell cell = grid[i][j];
                for (Animal animal : cell.getAnimals()) {
                    if (animal.isAlive()) {
                        animal.updateHunger();
                        animal.move(this);
                    }
                }
                // Grow plants
                for (Plant plant : cell.getPlants()) {
                    if (plant.isAlive()) {
                        plant.grow();
                    }
                }
            }
        }
        printStatistics();
    }
    public static void addAnimalToCell(Animal animal, int i, int j){
        try{
            grid[i][j].addAnimal(animal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public Cell getCell(int x, int y) {
        return grid[x][y];
    }

    public int getWidth() {
        return grid.length;
    }

    public int getHeight() {
        return grid[0].length;
    }

    public boolean isInBounds(int x, int y) {
        return x >= 0 && x < WIDTH && y >= 0 && y < HEIGHT;
    }
    public void printStatistics() {
        System.out.println("Island Statistics:");
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                Cell cell = grid[i][j];
                for (Animal animal : cell.getAnimals()) {
                    animal.printStatus();
                }
            }
        }
    }

}
