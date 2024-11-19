package org.javatrain.is;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private final BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String data = "Data-" + i;
                queue.put(data); // добавляем данные в очередь
                System.out.println("Produced: " + data);
                Thread.sleep(500); // имитируем время производства
            }
            queue.put("EOF"); // используем EOF для завершения обработки
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String data = queue.take(); // забираем данные из очереди
                if (data.equals("EOF")) { // если получили EOF, выходим из цикла
                    break;
                }
                System.out.println("Consumed: " + data);
                Thread.sleep(1000); // имитируем время обработки
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
public class Main {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5); // создаем очередь с вместимостью 5

        // создаем производитель и потребитель
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        // запускаем потоки
        producerThread.start();
        consumerThread.start();

        try {
            // ждем завершения потоков
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Simulation finished.");
    }
}
