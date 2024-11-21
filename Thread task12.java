package org.javatrain.is;



public class Main {

    public static void main(String[] args) throws InterruptedException {
        TimerThread timerThread = new TimerThread(); // Создаем поток таймера
        timerThread.start(); // Запускаем таймер

        // Поток для остановки таймера через 10 секунд
        new Thread(() -> {
            try {
                Thread.sleep(10000); // Ждем 10 секунд
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Восстановление прерывания
            }
            timerThread.stopTimer(); // Останавливаем таймер
            System.out.println("Таймер остановлен.");
        }).start();
    }
}
