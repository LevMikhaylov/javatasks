package org.island;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class IslandSimulation {
    private ScheduledExecutorService scheduledExecutorService;
    private Island island;

    public IslandSimulation(int width, int height) {
        island = new Island(width, height);
        scheduledExecutorService = Executors.newScheduledThreadPool(3);
    }
    private void growPlants() {

        System.out.println("Growing plants...");
    }

    private void animalLifecycle() {
        ExecutorService animalExecutor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < island.getWidth(); i++) {
            for (int j = 0; j < island.getHeight(); j++) {
                Cell cell = island.getCell(i, j);
                for (Animal animal : cell.getAnimals()) {
                    int finalI = i;
                    int finalJ = j;
                    animalExecutor.submit(() -> {
                        animal.move(animal, finalI, finalJ);
                    });
                }
            }
        }
        animalExecutor.shutdown();
        try {
            animalExecutor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void printStatistics() {
        // Вывод статистики
        System.out.println("Printing statistics...");
    }
    public void startSimulation() {
        scheduledExecutorService.scheduleAtFixedRate(this::growPlants, 0, 10, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(this::animalLifecycle, 0, 10, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(this::printStatistics, 0, 10, TimeUnit.SECONDS);
    }
}
