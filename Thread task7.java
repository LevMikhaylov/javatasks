package org.javatrain.is;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Main {

    public static void main(String[]args){
        // Создадим пул из 10 потоков
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Long>> futures = new ArrayList<>();

        // Запускаем 10 задач по вычислению факториала
        for (int i = 1; i <= 10; i++) {
            final int number = i; // необходимо для использования в лямбда-выражении
            Callable<Long> task = () -> factorial(number);
            Future<Long> future = executor.submit(task);
            futures.add(future);
        }

        // Ожидаем завершение и получаем результаты
        for (int i = 0; i < futures.size(); i++) {
            try {
                Long result = futures.get(i).get();
                System.out.println("Факториал " + (i + 1) + " = " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Завершаем ExecutorService
        executor.shutdown();
    }

    // Метод для вычисления факториала числа
    private static Long factorial(int number) {
        if (number == 0) {
            return 1L; // факториал 0 равен 1
        }
        Long result = 1L;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    }
