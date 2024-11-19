package org.javatrain.is;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable{
    private final int id;
    private final CyclicBarrier barrier;

    public Task(int id, CyclicBarrier barrier) {
        this.id = id;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("Поток " + id + " выполняет свое задание...");
            // Симулируем выполнение задания с помощью задержки
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println("Поток " + id + " завершил задание.");

            // Ожидание остальных потоков
            barrier.await();
            // Все потоки дождались друг друга здесь
            System.out.println("Поток " + id + " продолжает к следующей фазе.");

        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
