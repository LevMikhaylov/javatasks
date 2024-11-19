package org.javatrain.is;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[]args){
        // Создаем несколько аккаунтов
        BankAccount account1 = new BankAccount("001", 1000);
        BankAccount account2 = new BankAccount("002", 1000);
        BankAccount account3 = new BankAccount("003", 1000);

        // Список потоков для выполнения переводов
        List<Thread> threads = new ArrayList<>();

        // Создаем потоки для перевода средств
        threads.add(new Thread(new TransferTask(account1, account2, 300)));
        threads.add(new Thread(new TransferTask(account2, account3, 200)));
        threads.add(new Thread(new TransferTask(account3, account1, 500)));
        threads.add(new Thread(new TransferTask(account1, account3, 700))); // This should fail due to insufficient funds

        // Запускаем потоки
        for (Thread thread : threads) {
            thread.start();
        }

        // Ждем завершения всех потоков
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Выводим балансы аккаунтов
        System.out.printf("Final balance of %s: %.2f ", account1.getAccountNumber(), account1.getBalance());
                System.out.printf("Final balance of %s: %.2f ", account2.getAccountNumber(), account2.getBalance());
                        System.out.printf("Final balance of %s: %.2f ", account3.getAccountNumber(), account3.getBalance());
    }
    }
