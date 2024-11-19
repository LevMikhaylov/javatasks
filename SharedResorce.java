package org.javatrain.is;

import java.util.concurrent.Semaphore;

public class SharedResource {
    private Semaphore semaphore = new Semaphore(2); // Разрешаем доступ только двум потокам одновременно

    public void accessResource(String threadName) {
        try {
            System.out.println(threadName + " пытается получить доступ к ресурсу.");
            // Получаем разрешение на доступ к ресурсу
            semaphore.acquire();

            System.out.println(threadName + " получил доступ к ресурсу.");
            // Имитируем работу с ресурсом
            Thread.sleep(2000);
            System.out.println(threadName + " освобождает ресурс.");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Восстанавливаем состояние прерванного потока
            System.out.println(threadName + " был прерван.");
        } finally {
            // Освобождаем разрешение после работы с ресурсом
            semaphore.release();
        }
    }
}
