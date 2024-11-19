package org.javatrain.is;
import java.util.concurrent.CyclicBarrier;


public class Main {

    public static void main(String[]args){
        final int numberOfWorkers = 5;
        CyclicBarrier barrier = new CyclicBarrier(numberOfWorkers, () -> System.out.println("Все потоки завершили свои задания. Переход к следующей фазе."));

        Thread[] workers = new Thread[numberOfWorkers];

        for (int i = 0; i < numberOfWorkers; i++) {
            workers[i] = new Thread(new Task(i + 1, barrier));
            workers[i].start();
        }

        // Ждем завершения всех потоков
        for (Thread worker : workers) {
            try {
                worker.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Главный поток завершил работу.");
    }
        }
