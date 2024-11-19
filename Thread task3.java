package org.javatrain.is;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[]args){
        // Создаем пул из 4 потоков
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 20; i++) {
            final int taskNumber = i; // Для использования в лямбда-выражении
            executorService.submit(() -> {
                // Выводим имя потока и номер задачи
                System.out.println("Поток: " + Thread.currentThread().getName() + " - Задача номер: " + taskNumber);
            });
        }

        // Завершаем работу пула
        executorService.shutdown();
    }
}
